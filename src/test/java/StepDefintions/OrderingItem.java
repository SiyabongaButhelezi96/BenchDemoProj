package StepDefintions;

import Pages.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class OrderingItem {
    WebDriver driver = null;;
    LoginPage login;
    HomePage home;
    SelectSpecs specs;
    ShoppingcartPage shoppingCart;
    CheckoutPage checkout;

    @Given("browser is open")
    public void browser_is_open() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("http://demowebshop.tricentis.com/books");
        driver.manage().window().maximize();

    }

    @And("user is on login page")
    public void user_is_on_login_page()
    {
        login = new LoginPage(driver);
        login.clickLoginLink();

    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {


        login.enterUsernameAndPassword(username, password);
    }

    @And("clicks login button")
    public void clicks_login_button() {
        login.clickLogin();
    }

    @Then("user is navigated to the Home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        login.checkLogoutLick();

    }


    @And("clicks the computers and Desktop link")
    public void clicks_the_computers_and_desktop_link() {
        home = new HomePage(driver);
        home.clickDesktopsLink();
    }

    @And("^selects to (.*)$")
    public void selects_to_sort_by_low_to_high(String sort) {
        home.setSortDropdown(sort);

    }

    @And("user clicks Add to cart button")
    public void user_clicks_Add_to_cart_button() {
        home.selectItem();
    }

    @Then("user is navigated to specs page")
    public void user_is_navigated_to_specs_page() throws InterruptedException {
        specs = new SelectSpecs(driver);
        Thread.sleep(2000);

    }

    @And("^user select type of (.*)$")
    public void user_selects_processor(int processor) {
        specs.selectProcessor(processor);
    }

    @And("^user selects (.*)$")
    public void user_selects_ram(int RAM) {
        specs.selectRAM(RAM);
    }
    @And("user chooses HDD")
    public void user_chooses_hdd() {
        specs.selectHDD();
    }

    @And("user chooses OS")
    public void user_chooses_os() {
        specs.selectOS();
    }

    @And("clicks and to cart button")
    public void clicks_and_to_cart_button() {
        specs.clickAddToCart();

    }

    @And("then clicks the shopping cart link")
    public void then_clicks_the_shopping_cart_link() {
        specs.clickShoppingCartLinkText();
    }

    @Then("user is navigated to the shopping cart page")
    public void user_is_navigated_to_the_shopping_cart_page() {

        shoppingCart = new ShoppingcartPage(driver);


    }

    @And("^user specifies (.*)$")
    public void user_specifies_quantity(String quantity) {
        shoppingCart.enterQuantity(quantity);
    }

    @And("user clicks checkbox to accept terms and conditions")
    public void user_clicks_checkbox_to_accept_terms_and_conditions() {
        shoppingCart.clickTermsAndConditionsCheckbox();
    }

    @And("user clicks the checkout button")
    public void user_clicks_the_checkout_button() {
        shoppingCart.clickCheckoutButton();
    }

    @Then("user is navigated to the checkout page")
    public void user_is_navigated_to_the_checkout_page() {
        checkout = new CheckoutPage(driver);
    }

    @And("user chooses billing address")
    public void user_chooses_billing_address() {
        checkout.clickContinueButton();
    }

    @And("user chooses shipping address")
    public void user_chooses_shipping_address() {
        checkout.clickShipButton();
    }

    @And("user chooses Shipping Method")
    public void user_chooses_shipping_method() {


    }

    @And("user chooses payment method")
    public void user_chooses_payment_method() {

    }

    @And("user confirms payments information")
    public void user_confirms_payments_information() {

    }

    @And("user confirms the order")
    public void user_confirms_the_order() {
        checkout.clickConfirmOrderButton();
    }

    @Then("order is completed")
    public void order_is_completed() {

        //driver.close();

    }


}
