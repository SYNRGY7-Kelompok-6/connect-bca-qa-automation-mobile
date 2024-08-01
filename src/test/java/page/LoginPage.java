package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.config.DriverFactory;

public class LoginPage extends DriverFactory {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public LoginPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By loginField = MobileBy.id("com.team6.connectbca:id/etUserId");
    By passwordField = MobileBy.id("com.team6.connectbca:id/etPassword");
    By masukButton = MobileBy.AccessibilityId("Tekan tombol ini untuk masuk");
    By logoConnectBCA = MobileBy.id("com.team6.connectbca:id/ivLogo");

    public void inputUserID(String userID) {
        MobileElement userIDElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(loginField));
        userIDElement.sendKeys(userID);
    }

    public void inputPassword(String password) {
        MobileElement passwordFieldElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passwordFieldElement.sendKeys(password);
    }

    public void clickMasukButton() {
        MobileElement masukButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(masukButton));
        masukButtonElement.click();
    }

    public void logoConnectBCAisDisplayed() {
        MobileElement logoConnectBCAPath = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(logoConnectBCA));
        logoConnectBCAPath.isDisplayed();
    }
}
