package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.config.DriverFactory;

public class InputAmountPage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public InputAmountPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By amount = MobileBy.id("com.team6.connectbca:id/inputNominal");
    By nextButtonTf = MobileBy.AccessibilityId("Lanjutkan");

    public void clickAmountField() {
        MobileElement amountButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(amount));
        amountButtonElement.click();
    }

    public void clearAmountField() {
        MobileElement amountButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(amount));
        amountButtonElement.clear();
    }

    public void amountInput(String nominal) {
        MobileElement inputAmount = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(amount));
        inputAmount.sendKeys(nominal);
//        Integer.parseInt(inputAmount.get)
    }

    public void clickNextButtonTf() {
        MobileElement nextButtonTfElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(nextButtonTf));
        nextButtonTfElement.click();
    }
}
