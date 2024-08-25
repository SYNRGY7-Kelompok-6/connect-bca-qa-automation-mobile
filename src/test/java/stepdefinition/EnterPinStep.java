package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.EnterPinPage;
import page.RecipientDetailPage;
import stepdefinition.config.DriverFactory;

public class EnterPinStep {
    EnterPinPage enterPinPage = new EnterPinPage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public EnterPinStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @And("User input pin")
    public void user_input_pin() {
        enterPinPage.clickSatuButton();
        enterPinPage.clickDuaButton();
        enterPinPage.clickTigaButton();
        enterPinPage.clickEmpatButton();
        enterPinPage.clickLimaButton();
        enterPinPage.clickEnamButton();
    }

    @Then("User successfully transfer")
    public void user_successfully_transfer() {
        enterPinPage.transaksiBerhasilIsDisplayed();
    }

    @And("User input incorrect pin")
    public void user_input_incorrect_pin() {
        enterPinPage.clickSatuButton();
        enterPinPage.clickSatuButton();
        enterPinPage.clickEmpatButton();
        enterPinPage.clickEnamButton();
        enterPinPage.clickLimaButton();
        enterPinPage.clickLimaButton();
    }

    @Then("User get an error message")
    public void user_get_an_error_message() {
        enterPinPage.pinSalahIsDisplayed();
    }
}
