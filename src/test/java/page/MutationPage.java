package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.config.DriverFactory;

import java.time.Duration;

public class MutationPage extends DriverFactory {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public MutationPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By hariIniButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hari Ini\")");
    By listMutation = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(6)");
    By mutationUpward = MobileBy.AccessibilityId("Tarik ke atas untuk melihat mutasi dengan layar penuh");
    By copyButton = MobileBy.AccessibilityId("Tombol untuk menyalin nomor rekening");
    By bulanIniButton = MobileBy.AccessibilityId("Bulan Ini");
    By listMutation2 = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(7)");
    By cariMutationButton = MobileBy.AccessibilityId("Cari");
    By dataBerhasilDimuat = MobileBy.id("com.team6.connectbca:id/snackbar_text");

    public void clickHariIniButton() {
        MobileElement hariIniButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(hariIniButton));
        hariIniButtonElement.click();
    }

    public void listMutationIsDisplayed() {
        MobileElement listMutationElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(listMutation));
        listMutationElement.isDisplayed();
    }

    public void scrollMutation() {
        MobileElement mutationUpwardElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(mutationUpward));
        MobileElement copyButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(copyButton));
        TouchAction action = new TouchAction(driver);
        action.longPress(PointOption.point(mutationUpwardElement.getLocation().x, mutationUpwardElement.getLocation().y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(copyButtonElement.getLocation().x, copyButtonElement.getLocation().y)).release();
    }

    public void swipeToElementWithText(String text) {
        driver.findElement(
                new MobileBy.ByAndroidUIAutomator(
                        String.format("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))",text)));
    }

    public void clickBulanIniButton() {
        MobileElement bulanIniButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(bulanIniButton));
        bulanIniButtonElement.click();
    }

    public void listMutation2IsDisplayed() {
        MobileElement listMutation2Element = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(listMutation2));
        listMutation2Element.isDisplayed();
    }

    public void clickCariMutationButton() {
        MobileElement cariMutationButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(cariMutationButton));
        cariMutationButtonElement.click();
    }

    public void dataBerhasilDimuatIsDisplayed() {
        MobileElement dataBerhasilDimuatElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(dataBerhasilDimuat));
        dataBerhasilDimuatElement.click();
    }
}
