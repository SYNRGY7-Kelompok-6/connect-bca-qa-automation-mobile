package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinition.config.DriverFactory;

public class EnterPinPage {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public EnterPinPage() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    By satuButton = MobileBy.AccessibilityId("Satu");
    By duaButton = MobileBy.AccessibilityId("Dua");
    By tigaButton = MobileBy.AccessibilityId("Tiga");
    By empatButton = MobileBy.AccessibilityId("Empat");
    By limaButton = MobileBy.AccessibilityId("Lima");
    By enamButton = MobileBy.AccessibilityId("Enam");
    By transaksiBerhasil = MobileBy.id("com.team6.connectbca:id/tvTitle");
    By lihatBukti = MobileBy.AccessibilityId("Tombol Lihat Bukti");
    By buktiTransaksi = MobileBy.AccessibilityId("com.team6.connectbca:id/snackbar_text");
    By pinSalahNotification = MobileBy.id("com.team6.connectbca:id/errorMessage");

    public void clickSatuButton() {
        MobileElement satuButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(satuButton));
        satuButtonElement.click();
    }

    public void clickDuaButton() {
        MobileElement duaButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(duaButton));
        duaButtonElement.click();
    }

    public void clickTigaButton() {
        MobileElement tigaButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(tigaButton));
        tigaButtonElement.click();
    }

    public void clickEmpatButton() {
        MobileElement empatButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(empatButton));
        empatButtonElement.click();
    }

    public void clickLimaButton() {
        MobileElement limaButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(limaButton));
        limaButtonElement.click();
    }

    public void clickEnamButton() {
        MobileElement enamButtonElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(enamButton));
        enamButtonElement.click();
    }

    public void transaksiBerhasilIsDisplayed() {
        MobileElement transaksiBerhasilElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(transaksiBerhasil));
        transaksiBerhasilElement.isDisplayed();
    }

    public void clickLihatBukti() {
        MobileElement lihatBuktiElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(lihatBukti));
        lihatBuktiElement.click();
    }

    public void buktiTransaksiDisplayed() {
        MobileElement buktiTransaksiElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(buktiTransaksi));
        buktiTransaksiElement.isDisplayed();
    }

    public void pinSalahIsDisplayed() {
        MobileElement pinSalahNotificationElement = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(pinSalahNotification));
        pinSalahNotificationElement.isDisplayed();
    }
}
