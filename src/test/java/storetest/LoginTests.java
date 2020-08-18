package storetest;

import org.junit.Test;

public class LoginTests extends BaseTest {
    @Test
    public void shouldLogin() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        //enter username, password, click singin, verify title pagina pe care te logheaza si faptu ca te logheaza cu numele tau
    }

    @Test
    public void SuccessfulLogin() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.EnterEmail("denisa_oanca@yahoo.com");
        login.EnterPassword("abcdef");
        login.click_signInButton();
        login.checkTitle("MY ACCOUNT");

    }

    @Test
    public void WrongPassword() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.EnterEmail("denisa_oanca@yahoo.com");
        login.EnterPassword("aaaaa");
        login.click_signInButton();
        login.checkErrorMessage("Authentication failed.");
    }

    @Test
    public void WrongEmail() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.EnterEmail("denisaoanca");
        login.EnterPassword("abcdef");
        login.click_signInButton();
        login.checkError("Invalid email address.");
    }

    @Test
    public void SuccessfulChangePassword() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.clickForgotPass();
        login.checkPageTitle("FORGOT YOUR PASSWORD?");
        login.EnterEmail("denisa_oanca@yahoo.com");
        login.clickRetrievePassword();
        login.checkConfirmationMessage("A confirmation email has been sent to your address: denisa_oanca@yahoo.com");
    }

    @Test
    public void UnSuccessfulChangePassword() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.clickForgotPass();
        login.checkPageTitle("FORGOT YOUR PASSWORD?");
        login.clickRetrievePassword();
        login.checkErrorMessage2("Invalid email address.");
    }

    @Test
    public void PasswordFieldBlank() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.EnterEmail("denisa_oanca@yahoo.com");
        login.click_signInButton();
        login.checkErrorMessage("Password is required.");
    }

    @Test
    public void EmailFieldBlank() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.EnterPassword("parola");
        login.click_signInButton();
        login.checkErrorMessage("An email address required.");
    }

    @Test
    public void PasswordAndEmailFieldsBlank() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.click_signInButton();
        login.checkErrorMessage("An email address required.");
    }
}
