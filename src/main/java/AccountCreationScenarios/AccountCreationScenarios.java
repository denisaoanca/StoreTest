package AccountCreationScenarios;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationScenarios {
    private WebDriver webdriver;

    public AccountCreationScenarios(WebDriver driver) {
        this.webdriver = driver;
    }


    @FindBy(xpath = "//*[@id=\"email_create\"]")
    private WebElement emailField;

    public void EnterEmail(String email) {
        emailField.sendKeys(email);
    }

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
    private WebElement createaccount;

    public void ClickCreateAnAccount() {
        createaccount.click();
    }

    @FindBy(xpath = "//*[@id=\"account-creation_form\"]/div[1]/h3")
    private WebElement createanaccountpage;

    public void CheckTitle(String expectedTitle) {
        Assert.assertTrue(expectedTitle.equals(createanaccountpage.getText()));
    }

    @FindBy(xpath = "//*[@id=\"id_gender2\"]")
    private WebElement gender;

    public void CheckGender() {
        gender.click();
    }

    @FindBy(xpath = "//*[@id=\"customer_firstname\"]")
    private WebElement firstname;

    public void EnterFirstName(String firstn) {
        firstname.sendKeys(firstn);
    }

    @FindBy(xpath = "//*[@id=\"customer_lastname\"]")
    private WebElement lastname;

    public void EnterLastName(String lastn) {
        lastname.sendKeys(lastn);
    }

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    private WebElement password;

    public void EnterPassword(String pass) {
        password.sendKeys(pass);
    }

    @FindBy(xpath = "//*[@id=\"days\"]")
    private WebElement Day;

    public void AddDayOfBirth(String day) {
        Select selectDayOfBirth= new Select(Day);
        selectDayOfBirth.selectByValue(day);
    }

    @FindBy(xpath = "//*[@id=\"months\"]")
    private WebElement Month;

    public void AddMonthOfBirth(String month) {
        Select selectMonthOfBirth= new Select(Month);
        selectMonthOfBirth.selectByValue(month);
    }

    @FindBy(xpath = "//*[@id=\"years\"]")
    private WebElement Year;

    public void AddYearOfBirth(String year) {
        Select selectYearOfBirth= new Select(Year);
        selectYearOfBirth.selectByValue(year);
    }

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    private WebElement firstname2;

    public void FirstNameForAddress(String firstnamee) {
        firstname2.sendKeys(firstnamee);
    }

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    private WebElement lastname2;

    public void LastNameForAddress(String lastnamee) {
        lastname2.sendKeys(lastnamee);
    }

    @FindBy(xpath = "//*[@id=\"company\"]")
    private WebElement company;

    public void EnterCompany (String comp) {
        company.sendKeys(comp);
    }

    @FindBy(xpath = "//*[@id=\"address1\"]")
    private WebElement address;

    public void AddAdress(String ad) {
        address.sendKeys(ad);
    }

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement City;

    public void AddCity(String c) {
        City.sendKeys(c);
    }

    @FindBy(xpath = "//*[@id=\"id_state\"]")
    private WebElement State;

    public void AddState(String state) {
        Select StateField= new Select(State);
        StateField.selectByVisibleText(state);
    }



    @FindBy(xpath = "//*[@id=\"postcode\"]")
    private WebElement postcode;

    public void AddPostcode(String code) {
        postcode.sendKeys(code);
    }

    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    private WebElement mobile;

    public void AddMobilePhone(String phone) {
        mobile.sendKeys(phone);
    }

    @FindBy(xpath = "//*[@id=\"submitAccount\"]")
    private WebElement Register;

    public void ClickOnRegister() {
        Register.click();
    }

    @FindBy(xpath="//*[@id=\"center_column\"]/div/ol/li")
    private WebElement errormessage;
    public void CheckErrorMessage(String err) {
        Assert.assertTrue(err.equals(errormessage.getText()));
    }
 @FindBy(xpath = "//*[@id=\"create_account_error\"]/ol/li")
    private WebElement createaccounterror;
    public void Create_Account_Error(String cre){
        Assert.assertTrue(cre.equals(createaccounterror.getText()));
    }
}


