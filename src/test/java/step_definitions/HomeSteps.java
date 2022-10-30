package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;
    public HomeSteps() {
        page = new HomePage();
    }


    @When("I enter email admin@yahoo.com")
    public void i_enter_email_admin_yahoo_com() {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Username"))).sendKeys("admin@yahoo.com");
    }
    @When("I enter password admin123")
    public void i_enter_password_admin123() {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Password"))).sendKeys("admin123");
    }
    @Then("Click Login button")
    public void click_login_button() {
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_BUTTON, "Login"))));
    }
    @Then("Verify Manage Access button is displayed")
    public void verify_manage_access_button_is_displayed() {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath("//a/u[text()='Manage Access']")));
    }

}
