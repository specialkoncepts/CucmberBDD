package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Given("I open url login page")
    public void i_open_url_login_page() {
        BrowserUtils.getDriver();
    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Username"))), username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Password"))), password);
    }

    @When("I click a button {string}")
    public void i_click_a_button(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, button))));

    }

    @And("I click a button hide don't")
    public void iClickAButtonHideDonT() {
        BrowserUtils.click(page.hideDontBtn);
    }

    @And("I click a button add dont")
    public void iClickAButtonAddDont() {
        BrowserUtils.click(page.addDontBtn);
    }

    @Then("I verify page title")
    public void i_verify_page_title() {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), "Interview App");
    }


    @And("I input do field {string}")
    public void iInput(String text) {
        BrowserUtils.sendKeys(page.inputArea1, text);
        System.out.println("I enter: " + text);

    }

    @And("I input dont field {string}")
    public void iInputDontField(String text) {
        BrowserUtils.sendKeys(page.inputArea2, text);
    }


    @Then("Verify do statement {string}")
    public void verifyDoStatement(String text) {
        BrowserUtils.assertEquals(page.lastDoElement.getText(), text);
    }



    @Then("Verify dont statement {string}")
    public void verifyDontStatement(String text) {
        BrowserUtils.assertEquals(page.lastDontElement.getText(), text);
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

