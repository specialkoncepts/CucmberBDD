package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.utils.BrowserUtils;

import java.util.Map;

public class UserAccessSteps implements CommonPage
{
    HomePage page;

    public UserAccessSteps(){
        this.page = new HomePage();
    }

    @Given("User open url")
    public void userOpenUrl() {
    }
    @When("User login with username\"test@yahoo.com\"")
    public void user_login_with_username_test_yahoo_com()
    {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Username"))).sendKeys("test@yahoo.com");
    }
    @Then("User login with password\"test123\"")
    public void user_login_with_password_test123()
    {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Password"))).sendKeys("test123");
    }
    @Then("User click login button")
    public void userClickLoginButton()
    {
        BrowserUtils.click(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_BUTTON, "Login"))));
    }
    @Then("Verify user Should only see sign out button from the nav bar after signed in")
    public void verifyUserShouldOnlySeeSignOutButtonFromTheNavBarAfterSignedIn()
    {
        String btn = "Sign out";
        String navBtn = "";
        if(navBtn.equalsIgnoreCase(String.valueOf(equals(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn )))))))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
    }
}
