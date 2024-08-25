package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.config.DriverFactory;

public class QrisPage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public QrisPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By tampilkanQR = MobileBy.id("com.team6.connectbca:id/tvShowQr");
    By qrCode = MobileBy.id("com.team6.connectbca:id/ivQrCode");

    public void clickTampilakanQR() {
        MobileElement tampilkanQRElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(tampilkanQR));
        tampilkanQRElement.click();
    }

    public void qrCodeIsDisplayed() {
        MobileElement qrCodeElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(qrCode));
        qrCodeElement.isDisplayed();
    }
}
