package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.config.DriverFactory;

public class HomePage extends DriverFactory{
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public HomePage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By username = MobileBy.id("com.team6.connectbca:id/salutationText");
    By mutation = MobileBy.id("com.team6.connectbca:id/homeMutationIcon");
    By qris = MobileBy.id("com.team6.connectbca:id/homeQrisIcon");
    By transfer = MobileBy.id("com.team6.connectbca:id/homeTransferIcon");

    public void usernameUserDisplayed() {
        MobileElement usernameElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        usernameElement.isDisplayed();
    }

    public void clickMutationButton() {
        MobileElement mutationButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(mutation));
        mutationButtonElement.click();
    }

    public void clickQris() {
        MobileElement qrisButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(qris));
        qrisButtonElement.click();
    }

    public void clickTransfer() {
        MobileElement transferButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(transfer));
        transferButtonElement.click();
    }
}
