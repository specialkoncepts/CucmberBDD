package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.Map;

public class UserAccessSteps implements CommonPage
{
    HomePage page;

    public UserAccessSteps(){
        this.page = new HomePage();
    }
    @Given("User open url {string}")
    public void user_open_url(String string) {
        BrowserUtils.getDriver();
    }

    @Then("User login with username\"test@yahoo.com\"")
    public void user_login_with_username_test_yahoo_com(Map<String, String> map)
    {
        for(String key: map.keySet()){
                BrowserUtils.sendKeys(
                        BrowserUtils.getDriver().findElement(By.name(key)), map.get(key)
                );

        }

    }

    @Then("User login with password\"test123\"")
    public void user_login_with_password_test123() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify user Should see {string} button from the nav bar after signed in")
    public void verify_user_should_see_button_from_the_nav_bar_after_signed_in(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify user should not have access to {string} button")
    public void verify_user_should_not_have_access_to_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
