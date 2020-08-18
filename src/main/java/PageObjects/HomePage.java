package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver WebDriver;

    public HomePage(WebDriver driver) {
        this.WebDriver = driver;
        this.WebDriver.get("http://automationpractice.com/index.php");
    }

    @FindBy(xpath = "//*[@class='login']")

    private WebElement signInButton;

    public void click_signInButton() {
        signInButton.click();
    }

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    private WebElement logo;

    public void DisplayHomePage() {
        logo.isDisplayed();
    }
}
