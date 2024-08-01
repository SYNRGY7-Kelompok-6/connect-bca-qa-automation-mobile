package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;
import stepdefinition.config.DriverFactory;

public class HomeStep {
    HomePage homePage = new HomePage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public HomeStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @Then("User is on home page")
    public void user_is_on_home_page() throws InterruptedException {
        homePage.usernameUserDisplayed();
    }
}
