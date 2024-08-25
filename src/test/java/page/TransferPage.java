package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.config.DriverFactory;

public class TransferPage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public TransferPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By accountTransfer = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(4)");

    public void clickAccountTransfer() {
        MobileElement accountTransferElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(accountTransfer));
        accountTransferElement.click();
    }
}
