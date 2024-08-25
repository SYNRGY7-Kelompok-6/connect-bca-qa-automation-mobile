package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;
import page.MutationPage;
import stepdefinition.config.DriverFactory;

import java.time.Duration;

public class MutationStep {
    MutationPage mutationPage = new MutationPage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public MutationStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @When("User click hari ini button")
    public void user_click_hari_ini_button() {
        mutationPage.clickHariIniButton();
        mutationPage.scrollMutation();
    }

    @Then("User can see the mutation of current day")
    public void user_can_see_the_mutation_of_current_day() {
//        mutationPage.listMutationIsDisplayed();
        mutationPage.dataBerhasilDimuatIsDisplayed();
    }

    @When("User click bulan ini button")
    public void userClickBulanIniButton() {
        mutationPage.clickBulanIniButton();
    }

    @And("User scroll to {string}")
    public void userScrollTo(String text) {
        mutationPage.swipeToElementWithText(text);
    }

    @Then("User can see the mutation of current month")
    public void userCanSeeTheMutationOfCurrentMonth() {
        mutationPage.listMutation2IsDisplayed();
    }

    @When("User click cari button")
    public void userClickCariButton() {
        mutationPage.clickCariMutationButton();
    }
}
