package SeleniumApps.Steps;

import SeleniumApps.Pages.LookingAndAddingAnItemToCartPage;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LookingAndAddingAnItemToCartSteps {

    @Page
    LookingAndAddingAnItemToCartPage cartItem;

    @Steps
    OpenWebDriverAndWebpageSteps openPage;

    @Step("Opens the WebDriver and the webpage, selects the Women category")
    public void clickOnWomenMainMenu() {
        openPage.openWebBrowserAndTheWebpage();
        cartItem.TheWomenMainMenu.click();
    }

    @Step("Clicks on Tops subcategory after selecting Women")
    public void clickOnTopsSubCategory() {
        new Actions(cartItem.getDriver()).moveToElement(cartItem.TheTopsSubCategory).
                click().build().perform();
    }

    @Step("Selects Blouses, then the white color, size and quantity")
    public void selectsBlouseColorQuantityAndSize() {
        JavascriptExecutor executor = (JavascriptExecutor) cartItem.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", cartItem.TheBlouseItem);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cartItem.TheBlouseItem.click();
        cartItem.TheBlouseWhiteColour.click();
        new Select(cartItem.getDriver().
                findElement(By.id("group_1"))).selectByVisibleText("L");
        cartItem.ItemQuantityInputField.clear();
        cartItem.ItemQuantityInputField.sendKeys("3");
    }

    @Step("Adds the blouse to the cart")
    public void addTheBlouseToTheCart() {
        cartItem.WhiteBlouseAddCartButton.click();
    }

    @Step("Presses the Continue shopping button")
    public void clicksContinueShoppingButton() {
        cartItem.ContinueShoppingButton.click();
    }

    @Step("Presses the Proceed to checkout button")
    public void clicksProceedToCheckoutButton() {
        cartItem.ProceedToCheckoutButton.click();
    }

}
