package SeleniumApps.Steps;

import SeleniumApps.Pages.CreateNewAccountPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static java.util.concurrent.TimeUnit.SECONDS;

public class OpenWebDriverAndWebpageSteps {

    @Page
    CreateNewAccountPage openPage;

    @Step("Opens the webdriver and then the main webpage")
    public void openWebBrowserAndTheWebpage() {
        openPage.getDriver().manage().window().maximize();
        openPage.open();
        openPage.getDriver().manage().timeouts().pageLoadTimeout(10, SECONDS);
    }
}
