package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.config.DriverFactory;

public class TransactionDetailPage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public TransactionDetailPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By prosesTransaksiButton = MobileBy.id("com.team6.connectbca:id/processButton");

    public void clickProsesTransaksiButton() {
        MobileElement prosesTransaksiButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(prosesTransaksiButton));
        prosesTransaksiButtonElement.click();
    }
}
