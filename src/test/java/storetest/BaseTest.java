package storetest;

import AccountCreationScenarios.AccountCreationScenarios;
import LoginScenarios.LoginTestCases;
import PageObjects.AuthenticationPage;
import PageObjects.HomePage;
import PlaceAnOrderScenarios.OrderTestCases;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver webDriver;
    public HomePage homePage;
    public AuthenticationPage authenticationPage;
    public LoginTestCases login;
    public AccountCreationScenarios accountCreation;
    public OrderTestCases order;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(webDriver, HomePage.class);
        authenticationPage = PageFactory.initElements(webDriver, AuthenticationPage.class);
        login = PageFactory.initElements(webDriver, LoginTestCases.class);
        accountCreation = PageFactory.initElements(webDriver, AccountCreationScenarios.class);
        order = PageFactory.initElements(webDriver, OrderTestCases.class);
    }

    @After
    public void after() {
        //webDriver.quit();
    }

}
