package SeleniumApps.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LookingAndAddingAnItemToCartPage extends PageObject {

    @FindBy(xpath = "//a[@title='Women']")
    public WebElement TheWomenMainMenu;

    @FindBy(xpath = "(//a[@title='Tops'])[2]")
    public WebElement TheTopsSubCategory;

    @FindBy(xpath = "(//a[@title='Blouse'])[2]")
    public WebElement TheBlouseItem;

    @FindBy(id = "color_8")
    public WebElement TheBlouseWhiteColour;

    @FindBy(name = "Submit")
    public WebElement WhiteBlouseAddCartButton;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    public WebElement ContinueShoppingButton;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement ProceedToCheckoutButton;

    @FindBy(id = "quantity_wanted")
    public WebElement ItemQuantityInputField;

}
