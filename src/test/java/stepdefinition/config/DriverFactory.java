package stepdefinition.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    public static AppiumDriver<MobileElement> driver;
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "C:/Users/desak/Downloads/connectbybca6.apk");
        capabilities.setCapability("appPackage", "com.team6.connectbca");
        capabilities.setCapability("autoGrantPermissions", true);
//        capabilities.setCapability("appActivity", "com.team6.connectbca.MainActivity");

//        driver = new AndroidDriver(capabilities);
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), capabilities);
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
