package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {
    private WebDriver WebDriver;

    public AuthenticationPage(WebDriver driver) {
        this.WebDriver = driver;

    }

    @FindBy(xpath="//*[@class='page-heading']")

    private WebElement pageTitle;

    public void checkPageTitle(String expectedTitle) {
        Assert.assertTrue(expectedTitle.equals(pageTitle.getText()));
    }
}
