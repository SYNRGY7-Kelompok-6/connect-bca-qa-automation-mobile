package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.config.DriverFactory;

public class RecipientDetailPage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public RecipientDetailPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By nextButton = MobileBy.AccessibilityId("Lanjutkan");

    public void clickNextButton() {
        MobileElement nextButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
        nextButtonElement.click();
    }
}
