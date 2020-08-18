package PlaceAnOrderScenarios;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrderTestCases {
    private WebDriver webdriver;

    public OrderTestCases(WebDriver driver) {
        this.webdriver = driver;
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    private WebElement women;

    public void ClickOnWomenCategory() {
        women.click();
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/span")
    private WebElement womenpage;

    public void CheckTitle(String expectedTitle) {
        Assert.assertTrue(expectedTitle.equals(womenpage.getText()));
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[4]")
    private WebElement dress;

    public void ChooseADress() {
        dress.click();
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[1]")
    private WebElement addtocart;

    public void ClickAddToCart() {
        addtocart.click();
    }

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    private WebElement proceed;

    public void ProceedToCheckout() {
        proceed.click();
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    private WebElement proceedtocheckout;

    public void ProceedToCheckout2() {
        proceedtocheckout.click();
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    private WebElement proceedtocheckout3;

    public void ProceedToCheckout3() {
        proceedtocheckout3.click();
    }

    @FindBy(xpath = "//*[@id=\"cgv\"]")
    private WebElement agree;

    public void AgreeTheTerms() {
        agree.click();
    }

    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    private WebElement proceedtocheckout4;

    public void ProceedToCheckout4() {
        proceedtocheckout4.click();
    }

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    private WebElement bankwire;

    public void PayByBankWire() {
        bankwire.click();
    }

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
    private WebElement confirmation;

    public void Confirmation() {
        confirmation.click();
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    private WebElement confirmationpage;

    public void CheckTitle2(String expectedTitle2) {
        Assert.assertTrue(expectedTitle2.equals(confirmationpage.getText()));
    }

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
    private WebElement check;

    public void PayByCheck() {
        check.click();
    }

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[3]")
    private WebElement dress1;

    public void ChooseADress1() {
        dress1.click();
    }

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[2]")
    private WebElement quick;

    public void QuickView() {
        quick.click();
    }

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]")
    private WebElement add;

    public void AddToCartDirectly() {
        add.click();
    }

    @FindBy(xpath = "//*[@id=\"search_query_top\"]")
    private WebElement search;

    public void EnterWhatYouWantToSearch(String s) {
        search.sendKeys(s);
    }

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    private WebElement searchbutton;

    public void PressSearchButton() {
        searchbutton.click();
    }

    @FindBy(xpath = "//*[@id=\"selectProductSort\"]")
    private WebElement Sort;

    public void Sorting(String sort) {
        Select SortField = new Select(Sort);
        SortField.selectByValue(sort);
    }

    @FindBy(xpath = "//*[@id=\"layered_id_attribute_group_2\"]")
    private WebElement Filter;

    public void FilteringBySizeM() {
        Filter.click();

    }

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    private WebElement Cart;

    public void EmptyCartClick() {
        Cart.click();

    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    private WebElement emptycerror;

    public void CheckEmpltyCartError(String errr) {
        Assert.assertTrue(errr.equals(emptycerror.getText()));
    }

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
    private WebElement Continue;

    public void ContinueShopping() {
        Continue.click();

    }

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a")
    private WebElement Remove;

    public void RemoveButton() {
        Remove.click();

    }

    @FindBy(xpath = "//*[@id=\"cart_quantity_up_7_34_0_0\"]")
    private WebElement Increase;

    public void IncreassingButton() {
        Increase.click();
    }

    @FindBy(xpath = "//*[@id=\"cart_quantity_down_7_34_0_0\"]")
    private WebElement Decrease;

    public void DecreassingButton() {
        Decrease.click();
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1")
    private WebElement addresspage;

    public void checkAddressTitle(String expected) {
        Assert.assertTrue(expected.equals(addresspage.getText()));
    }

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[7]/a")
    private WebElement Update;

    public void PressUpdateButton() {
        Update.click();
    }

    @FindBy(xpath = "//*[@id=\"submitAddress\"]")
    private WebElement Save;

    public void ClickOnSave() {
        Save.click();
    }
}
