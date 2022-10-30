package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.CommonPage;
import utils.BrowserUtils;

public class DashboardSteps implements CommonPage {
    @Then("Verify link text {string} is displayed")
    public void verify_link_text_is_displayed(String buttonName) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(By.xpath(
                        String.format(XPATH_TEMPLATE_LINKTEXT, buttonName)
                ))
        );
    }
}
