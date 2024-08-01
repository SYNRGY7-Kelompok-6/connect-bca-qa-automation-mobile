package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;
import page.LoginPage;
import stepdefinition.config.DriverFactory;

public class LoginStep extends DriverFactory {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public LoginStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @Given("User is on login page")
    public void user_is_on_login_page() {
        loginPage.logoConnectBCAisDisplayed();
    }

    @And("User input {string} as username")
    public void userInputAsUsername(String userID) {
        loginPage.inputUserID(userID);
    }

    @And("User input {string} as password")
    public void userInputAsPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("User click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickMasukButton();
    }
}
