package storetest;

import org.junit.Test;

public class AccountCreationTests extends BaseTest {

    @Test
    public void SuccessfulAccountCreation() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        accountCreation.EnterEmail("denisa6@test.com");
        accountCreation.ClickCreateAnAccount();
        accountCreation.CheckTitle("YOUR PERSONAL INFORMATION");
        accountCreation.CheckGender();
        accountCreation.EnterFirstName("Denisa");
        accountCreation.EnterLastName("Oanca");
        accountCreation.EnterPassword("123456");
        accountCreation.AddDayOfBirth("10");
        accountCreation.AddMonthOfBirth("4");
        accountCreation.AddYearOfBirth("2002");
        accountCreation.FirstNameForAddress("Denisa");
        accountCreation.LastNameForAddress("Oanca");
        accountCreation.EnterCompany("Endava");
        accountCreation.AddAdress("LaLaLand");
        accountCreation.AddCity("AAA");
        accountCreation.AddState("Hawaii");
        accountCreation.AddPostcode("00000");
        accountCreation.AddMobilePhone("0700000000");
        accountCreation.ClickOnRegister();
        login.checkTitle("MY ACCOUNT");

    }

    @Test
    public void UnSuccessfulAccountCreation_ExistingEmailAddress() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        accountCreation.EnterEmail("denisa_oanca@yahoo.com");
        accountCreation.ClickCreateAnAccount();

    }

    @Test
    public void AccountCreationUsingJustTheMandatoryFields() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        accountCreation.EnterEmail("anaaa@test.com");
        accountCreation.ClickCreateAnAccount();
        accountCreation.CheckTitle("YOUR PERSONAL INFORMATION");
        accountCreation.EnterFirstName("Ana");
        accountCreation.EnterLastName("Maria");
        accountCreation.EnterPassword("123456");
        accountCreation.FirstNameForAddress("Ana");
        accountCreation.LastNameForAddress("Maria");
        accountCreation.AddAdress("LaLaLand");
        accountCreation.AddCity("AAA");
        accountCreation.AddState("Hawaii");
        accountCreation.AddPostcode("00000");
        accountCreation.AddMobilePhone("0700000000");
        accountCreation.ClickOnRegister();
        login.checkTitle("MY ACCOUNT");
    }

    @Test
    public void NotFillingTheMandatoryFields_MoobilePhone() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        accountCreation.EnterEmail("anaaa2@test.com");
        accountCreation.ClickCreateAnAccount();
        accountCreation.CheckTitle("YOUR PERSONAL INFORMATION");
        accountCreation.EnterFirstName("Ana");
        accountCreation.EnterLastName("Maria");
        accountCreation.EnterPassword("123456");
        accountCreation.FirstNameForAddress("Ana");
        accountCreation.LastNameForAddress("Maria");
        accountCreation.AddAdress("LaLaLand");
        accountCreation.AddCity("AAA");
        accountCreation.AddState("Hawaii");
        accountCreation.AddPostcode("00000");
        accountCreation.ClickOnRegister();
        accountCreation.CheckErrorMessage("You must register at least one phone number.");


    }

    @Test
    public void NumericFieldsFilledWithAlphabets() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        accountCreation.EnterEmail("anaaa3@test.com");
        accountCreation.ClickCreateAnAccount();
        accountCreation.CheckTitle("YOUR PERSONAL INFORMATION");
        accountCreation.EnterFirstName("Ana");
        accountCreation.EnterLastName("Maria");
        accountCreation.EnterPassword("123456");
        accountCreation.FirstNameForAddress("Ana");
        accountCreation.LastNameForAddress("Maria");
        accountCreation.AddAdress("LaLaLand");
        accountCreation.AddCity("AAA");
        accountCreation.AddState("Hawaii");
        accountCreation.AddPostcode("00000");
        accountCreation.AddMobilePhone("abcdefg");
        accountCreation.ClickOnRegister();
        accountCreation.CheckErrorMessage("phone_mobile is invalid.");

    }

    @Test
    public void UnsuccessfulAccountCreation_Blank_Email_Field() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        accountCreation.ClickCreateAnAccount();
        accountCreation.Create_Account_Error("Invalid email address.");
    }

    @Test
    public void WrongZipCode() {
        homePage.click_signInButton();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        accountCreation.EnterEmail("anaaaa@test.com");
        accountCreation.ClickCreateAnAccount();
        accountCreation.CheckTitle("YOUR PERSONAL INFORMATION");
        accountCreation.EnterFirstName("Ana");
        accountCreation.EnterLastName("Maria");
        accountCreation.EnterPassword("123456");
        accountCreation.FirstNameForAddress("Ana");
        accountCreation.LastNameForAddress("Maria");
        accountCreation.AddAdress("LaLaLand");
        accountCreation.AddCity("AAA");
        accountCreation.AddState("Hawaii");
        accountCreation.AddPostcode("0000000000");
        accountCreation.AddMobilePhone("0700000000");
        accountCreation.ClickOnRegister();
        accountCreation.CheckErrorMessage("The Zip/Postal code you've entered is invalid. It must follow this format: 00000");
    }


}
