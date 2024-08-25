package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.InputAmountPage;
import page.TransactionDetailPage;
import stepdefinition.config.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransactionDetailStep {
    TransactionDetailPage transactionDetailPage = new TransactionDetailPage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public TransactionDetailStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @And("User click proses transaksi button")
    public void user_click_proses_transaksi_button() {
        transactionDetailPage.clickProsesTransaksiButton();
    }
}
