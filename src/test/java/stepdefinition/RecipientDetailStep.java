package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import page.HomePage;
import page.RecipientDetailPage;
import stepdefinition.config.DriverFactory;

public class RecipientDetailStep {
    RecipientDetailPage recipientDetailPage = new RecipientDetailPage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public RecipientDetailStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @And("User click lanjutkan button")
    public void user_click_lanjutkan_button() {
        recipientDetailPage.clickNextButton();
    }
}
