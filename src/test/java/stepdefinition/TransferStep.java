package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.TransferPage;
import stepdefinition.config.DriverFactory;
public class TransferStep {
    TransferPage transferPage = new TransferPage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public TransferStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @When("User select list of account")
    public void user_select_list_of_account() {
        transferPage.clickAccountTransfer();
    }
}
