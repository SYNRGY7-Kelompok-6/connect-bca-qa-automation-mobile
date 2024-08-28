package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.ProfilePage;
import stepdefinition.config.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ProfileStep {
    ProfilePage profilePage = new ProfilePage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public ProfileStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @When("User click edit button")
    public void user_click_edit_button() {
        profilePage.clickEditButton();
    }


    @And("User fill the name with {string}")
    public void userFillTheNameWith(String name) {
        profilePage.clickFieldName();
        profilePage.clearFieldName();
        profilePage.fieldNameInput(name);
        driver.navigate().back();
        profilePage.clickEditEmailButton();
    }

    @Then("User sucessfully edit the name")
    public void userSucessfullyEditTheName() {
        profilePage.editNameSuccessIsDisplayed();
    }
}
