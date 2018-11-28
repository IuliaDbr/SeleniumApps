package SeleniumApps.Steps;

import SeleniumApps.LoginAndAccountCredentials;
import SeleniumApps.Pages.CreateNewAccountPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static java.util.concurrent.TimeUnit.SECONDS;

public class CreateNewAccountSteps {

    @Page
    CreateNewAccountPage newAccount;
    LoginAndAccountCredentials credentials = new LoginAndAccountCredentials();

    @Step ("Opens the webdriver and then the main webpage")
    public void openWebBrowserAndTheWebpage (){
        newAccount.getDriver().manage().window().maximize();
        newAccount.open();
        newAccount.getDriver().manage().timeouts().pageLoadTimeout(10,SECONDS);
    }

    @Step ("Given SignIn button, when I enter the email address, then I press the Create button")
    public void givenTheSignInButton_WhenIInputNewEmail_ThenIPressTheCreateButton(){
        openWebBrowserAndTheWebpage();
        newAccount.TheSignInButton.click();
        newAccount.EmailAddressInputField.sendKeys(credentials.newAccountEmail);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        newAccount.TheCreateANewAccountButton.click();
        newAccount.getDriver().close();
    }

}
