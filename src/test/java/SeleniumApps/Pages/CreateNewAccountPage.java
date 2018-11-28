package SeleniumApps.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://automationpractice.com")
public class CreateNewAccountPage extends PageObject {

    @FindBy (xpath = "//a[@class=\"login\"]")
    public  WebElement TheSignInButton;

    @FindBy (id = "SubmitCreate")
    public WebElement TheCreateANewAccountButton;

    @FindBy (id="email_create")
    public WebElement EmailAddressInputField;
}
