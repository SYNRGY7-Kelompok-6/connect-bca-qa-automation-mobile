package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.InputAmountPage;
import stepdefinition.config.DriverFactory;
import io.cucumber.java.en.And;

public class InputAmountStep {
    InputAmountPage inputAmountPage = new InputAmountPage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public InputAmountStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @And("User enter amount transaction with {string}")
    public void user_enter_amount_transaction_with(String nominal) {
        inputAmountPage.clickAmountField();
        inputAmountPage.clearAmountField();
        inputAmountPage.amountInput(nominal);
        driver.navigate().back();
        inputAmountPage.clickNextButtonTf();
    }
}
