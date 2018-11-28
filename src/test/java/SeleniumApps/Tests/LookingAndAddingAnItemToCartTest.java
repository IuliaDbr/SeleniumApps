package SeleniumApps.Tests;


import SeleniumApps.Steps.LookingAndAddingAnItemToCartSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LookingAndAddingAnItemToCartTest {

    @Managed
    public WebDriver browser;

    @Steps
    LookingAndAddingAnItemToCartSteps addItem;

    @Test
    @Title("")
    public void givenTheMainPage_WhenISelectWomenCateg_ThenICanChooseTopsCateg() {
        addItem.clickOnWomenMainMenu();
        addItem.clickOnTopsSubCategory();
    }

    @Test
    @Title("")
    public void givenTheTopsPage_WhenIClickBlouses_ThenICanCustomizeTheBlouse() {
        givenTheMainPage_WhenISelectWomenCateg_ThenICanChooseTopsCateg();
        addItem.selectsBlouseColorQuantityAndSize();
    }

    @Test
    @Title("")
    public void givenACustomizedBlouse_WhenIClickAddCart_ThenIContinueShopping() {
        givenTheMainPage_WhenISelectWomenCateg_ThenICanChooseTopsCateg();
        givenTheTopsPage_WhenIClickBlouses_ThenICanCustomizeTheBlouse();
        addItem.addTheBlouseToTheCart();
        addItem.clicksContinueShoppingButton();
    }

    @Test
    @Title("")
    public void givenACustomizedBlouse_WhenIAddToCart_ThenIProceedToCheckout() {
        givenTheMainPage_WhenISelectWomenCateg_ThenICanChooseTopsCateg();
        givenTheTopsPage_WhenIClickBlouses_ThenICanCustomizeTheBlouse();
        addItem.addTheBlouseToTheCart();
        addItem.clicksProceedToCheckoutButton();
    }
}
