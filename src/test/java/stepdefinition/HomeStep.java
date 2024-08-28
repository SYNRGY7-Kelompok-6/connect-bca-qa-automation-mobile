package stepdefinition;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;
import stepdefinition.config.DriverFactory;

public class HomeStep {
    HomePage homePage = new HomePage();
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public HomeStep() {
        this.driver = (AndroidDriver<MobileElement>) DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 15);
    }

    @Then("User is on home page")
    public void user_is_on_home_page() throws InterruptedException {
        homePage.usernameUserDisplayed();
    }

    @Given("User in on mutation page")
    public void user_in_on_mutation_page() {
        homePage.clickMutationButton();
    }

    @Given("User is on the qris page")
    public void user_is_on_the_qris_page() {
        homePage.clickQris();
    }

    @Given("User is on the transfer page")
    public void user_is_on_the_transfer_page() {
        homePage.clickTransfer();
    }

    @Given("User click eye button")
    public void userClickEyeButton() {
        homePage.clickEyeIcon();
    }

    @Then("User should be able see balance amount")
    public void userShouldBeAbleSeeBalanceAmount() {
        homePage.balanceAmountIsDisplayed();
    }

    @Given("User click copy icon")
    public void userClickCopyIcon() {
        homePage.clickCopyIcon();
    }

    @Then("User should be able copied account number")
    public void userShouldBeAbleCopiedAccountNumber() {
        homePage.successfulCopyIsDisplayed();
    }

    @Given("User is on the profile page")
    public void userIsOnTheProfilePage() {
        homePage.clickProfilePage();
    }
}
