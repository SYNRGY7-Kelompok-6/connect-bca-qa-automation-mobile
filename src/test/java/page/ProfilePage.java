package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.config.DriverFactory;

public class ProfilePage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public ProfilePage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By editButton = MobileBy.id("com.team6.connectbca:id/btnNameEdit");
    By fieldName = MobileBy.id("com.team6.connectbca:id/etName");
    By editNameSuccess = MobileBy.id("com.team6.connectbca:id/snackbar_text");
    By editEmailButton = MobileBy.id("com.team6.connectbca:id/btnEmailEdit");

    public void clickEditButton() {
        MobileElement editButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(editButton));
        editButtonElement.click();
    }

    public void clickFieldName() {
        MobileElement fieldNameElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(fieldName));
        fieldNameElement.click();
    }

    public void clearFieldName() {
        MobileElement fieldNameElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(fieldName));
        fieldNameElement.clear();
    }

    public void fieldNameInput(String name) {
        MobileElement inputName = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(fieldName));
        inputName.sendKeys(name);
    }
    public void editNameSuccessIsDisplayed() {
        MobileElement editNameSuccessElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(editNameSuccess));
        editNameSuccessElement.isDisplayed();
    }

    public void clickEditEmailButton() {
        MobileElement editEmailButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(editEmailButton));
        editEmailButtonElement.click();
    }
}
