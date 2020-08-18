package storetest;

import org.junit.Test;

import java.beans.Transient;

public class PlaceAnOrderTests extends BaseTest {

    @Test
    public void ShopByCategories_PayByBankWire() {
        //user already has an account
        homePage.DisplayHomePage();
        order.ClickOnWomenCategory();
        order.CheckTitle("Women");
        order.ChooseADress();
        order.ClickAddToCart();
        order.ProceedToCheckout();
        order.ProceedToCheckout2();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.EnterEmail("denisa_oanca@yahoo.com");
        login.EnterPassword("abcdef");
        login.click_signInButton();
        order.ProceedToCheckout3();
        order.AgreeTheTerms();
        order.ProceedToCheckout4();
        order.PayByBankWire();
        order.Confirmation();
        order.CheckTitle2("ORDER CONFIRMATION");

    }

    @Test
    public void ShopByCategories_PayByCheck() {
        //user already has an account
        homePage.DisplayHomePage();
        order.ClickOnWomenCategory();
        order.CheckTitle("Women");
        order.ChooseADress();
        order.ClickAddToCart();
        order.ProceedToCheckout();
        order.ProceedToCheckout2();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.EnterEmail("denisa_oanca@yahoo.com");
        login.EnterPassword("abcdef");
        login.click_signInButton();
        order.ProceedToCheckout3();
        order.AgreeTheTerms();
        order.ProceedToCheckout4();
        order.PayByCheck();
        order.Confirmation();
        order.CheckTitle2("ORDER CONFIRMATION");

    }

    @Test
    public void SeeAProductBy_QuickView() {

        homePage.DisplayHomePage();
        order.ChooseADress1();
        order.QuickView();
    }

    @Test
    public void ShopAProductBy_AddToCartDirectly() {
        //user already has an account
        homePage.DisplayHomePage();
        order.ChooseADress1();
        order.AddToCartDirectly();
        order.ProceedToCheckout();
        order.ProceedToCheckout2();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.EnterEmail("denisa_oanca@yahoo.com");
        login.EnterPassword("abcdef");
        login.click_signInButton();
        order.ProceedToCheckout3();
        order.AgreeTheTerms();
        order.ProceedToCheckout4();
        order.PayByCheck();
        order.Confirmation();
        order.CheckTitle2("ORDER CONFIRMATION");
    }

    @Test
    public void ShopAProduct_UsingSearchOption() {
        homePage.DisplayHomePage();
        order.EnterWhatYouWantToSearch("Dress");
        order.PressSearchButton();
        order.ChooseADress();
        order.ClickAddToCart();
        order.ProceedToCheckout();
        order.ProceedToCheckout2();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.EnterEmail("denisa_oanca@yahoo.com");
        login.EnterPassword("abcdef");
        login.click_signInButton();
        order.ProceedToCheckout3();
        order.AgreeTheTerms();
        order.ProceedToCheckout4();
        order.PayByBankWire();
        order.Confirmation();
        order.CheckTitle2("ORDER CONFIRMATION");
    }

    @Test
    public void ShopBy_SortingCriteria() {
//there is a bug because Sorting Criteria is not working
        homePage.DisplayHomePage();
        order.ClickOnWomenCategory();
        order.CheckTitle("Women");
        order.Sorting("price:asc");
    }

    @Test
    public void ShopBy_FilterCriteria() {
//there is a bug because Filtering Criteria is not working
        homePage.DisplayHomePage();
        order.ClickOnWomenCategory();
        order.CheckTitle("Women");
        order.FilteringBySizeM();
    }

    @Test
    public void EmpltyCartCheeckout() {
        homePage.DisplayHomePage();
        order.EmptyCartClick();
        order.CheckEmpltyCartError("Your shopping cart is empty.");
    }

    @Test
    public void DeleteAProductFromTheCart() {
        homePage.DisplayHomePage();
        order.ChooseADress1();
        order.AddToCartDirectly();
        order.ContinueShopping();
        order.RemoveButton();
    }

    @Test
    public void IncreasingTheNumberOfProductsInTheCart() {
        homePage.DisplayHomePage();
        order.EnterWhatYouWantToSearch("Dress");
        order.PressSearchButton();
        order.ChooseADress();
        order.ClickAddToCart();
        order.ProceedToCheckout();
        order.IncreassingButton();
    }

    @Test
    public void DecresingTheNumberOfProductsInTheCart() {
        homePage.DisplayHomePage();
        order.EnterWhatYouWantToSearch("Dress");
        order.PressSearchButton();
        order.ChooseADress();
        order.ClickAddToCart();
        order.ProceedToCheckout();
        order.DecreassingButton();

    }

    @Test
    public void UpdateAddress() {
        //user has an account
        homePage.DisplayHomePage();
        order.EnterWhatYouWantToSearch("Dress");
        order.PressSearchButton();
        order.ChooseADress();
        order.ClickAddToCart();
        order.ProceedToCheckout();
        order.ProceedToCheckout2();
        authenticationPage.checkPageTitle("AUTHENTICATION");
        login.EnterEmail("denisa_oanca@yahoo.com");
        login.EnterPassword("abcdef");
        login.click_signInButton();
        order.checkAddressTitle("ADDRESSES");
        order.PressUpdateButton();
        accountCreation.AddAdress("Waa");
        order.ClickOnSave();
        order.checkAddressTitle("ADDRESSES");
    }


}
