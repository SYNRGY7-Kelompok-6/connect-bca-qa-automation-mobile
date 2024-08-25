package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;
import page.QrisPage;
import stepdefinition.config.DriverFactory;

public class QrisStep {
    HomePage homePage = new HomePage();
    QrisPage qrisPage = new QrisPage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public QrisStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @When("User click tampilkan QR button")
    public void user_click_tampilan_qr_button() {
        qrisPage.clickTampilakanQR();
    }

    @Then("QR Code is displayed")
    public void qr_code_displayed() {
        qrisPage.qrCodeIsDisplayed();
    }
}
