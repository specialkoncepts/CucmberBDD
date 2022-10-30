package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.AdminPage;
import pages.CommonPage;
import utils.BrowserUtils;

public class AdminSteps implements CommonPage {

    AdminPage page;
    public AdminSteps() {page = new AdminPage(); }

    @Given("I login as Admin")
    public void i_login_as_admin() {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Username"))).sendKeys("admin@yahoo.com");
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Password"))).sendKeys("admin123");
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_BUTTON, "Login"))));
    }
    @When("I click delete button the comment is deleted")
    public void i_click_delete_button_the_comment_is_deleted() {
        BrowserUtils.getDriver().findElement(By.xpath("//button[@class='btn btn-outline-danger ml-1']")).click();
    }

    @When("Admin clicks on New Dashboard window and Enter new Dashboard name")
    public void admin_clicks_on_new_dashboard_window() {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "New dashboard"))).sendKeys("New Dashboard");
    }

    @Then("click a button Add")
    public void click_a_button_add() {
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath("//button[@class='btn btn-primary mb-2']")));
    }
    @Then("Verify new Dashboard is displayed")
    public void verify_new_dashboard_is_displayed() {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath("(//button[@class='btn btn-light mb-2 border shadow-lg rounded'])[4]")));
    }

}
