package SeleniumApps.Tests;

import SeleniumApps.Steps.CreateNewAccountSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CreateNewAccountTest {

    @Managed
    public WebDriver browser;

    @Steps
    CreateNewAccountSteps newAccount;

    @Test
    @Title("Opens the Web page and creates a new account")
    public void givenTheSignInButton_WhenIInputNewEmail_ThenIPressTheCreateButton(){
        newAccount.givenTheSignInButton_WhenIInputNewEmail_ThenIPressTheCreateButton();
    }

}
