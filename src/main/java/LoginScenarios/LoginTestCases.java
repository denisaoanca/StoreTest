package LoginScenarios;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginTestCases {

    private WebDriver webdriver;

    public LoginTestCases(WebDriver driver) {
        this.webdriver = driver;


    }

    @FindBy(xpath = "//*[@id='email']")

    private WebElement emailField;

    @FindBy(xpath = "//*[@id='passwd']")

    private WebElement passField;

    public void EnterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void EnterPassword(String pass) {
        passField.sendKeys(pass);
    }

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")

    private WebElement SignInButton;

    public void click_signInButton() {
        SignInButton.click();
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol/li")

    private WebElement errormessage;

    public void checkErrorMessage(String expectedError) {
        Assert.assertTrue(expectedError.equals(errormessage.getText()));
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    private WebElement myaccountpage;

    public void checkTitle(String expectedTitle) {
        Assert.assertTrue(expectedTitle.equals(myaccountpage.getText()));
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol/li")
    private WebElement invalidemail;

    public void checkError(String expectederror) {
        Assert.assertTrue(expectederror.equals(invalidemail.getText()));
    }

    @FindBy(xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
    private WebElement forgottenpass;

    public void clickForgotPass() {
        forgottenpass.click();
    }

    @FindBy(xpath = "//*[@class='page-subheading']")
    private WebElement forgotpage;

    public void checkPageTitle(String expectedPageTitle) {
        Assert.assertTrue(expectedPageTitle.equals(forgotpage.getText()));
    }

    @FindBy(xpath = "//*[@id=\"form_forgotpassword\"]/fieldset/p/button")
    private WebElement retrieve;

    public void clickRetrievePassword() {
        retrieve.click();
    }

    @FindBy(xpath = "//*[@class='alert alert-success']")
    private WebElement confmessage;

    public void checkConfirmationMessage(String expectedmessage) {
        Assert.assertTrue(expectedmessage.equals(confmessage.getText()));
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div/ol/li")

    private WebElement errormessage2;

    public void checkErrorMessage2(String expectedError2) {
        Assert.assertTrue(expectedError2.equals(errormessage2.getText()));
    }


}

