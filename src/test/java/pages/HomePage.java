package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//nav//h2")
    public WebElement headerTxt;

    @FindBy(xpath = "//button[text()=\"Add don't \"]")
    public WebElement addDontBtn;

    @FindBy(xpath = "//button[text()=\"Hide don't\"]")
    public WebElement hideDontBtn;

    @FindBy(id="inputArea1")
    public WebElement inputArea1;

    @FindBy(id = "inputArea2")
    public WebElement inputArea2;

    @FindBy(xpath = "(//div[@class=' col-md-6'][1]/div/div/div[contains(@class, \"col-md-7\")])[last()]")
    public WebElement lastDoElement;
    @FindBy(xpath = "(//div[@class=' col-md-6'][2]/div/div/div[contains(@class, \"col-md-7\")])[last()]")
    public WebElement lastDontElement;


}
