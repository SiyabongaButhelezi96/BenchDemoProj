package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ShoppingcartPage {
    WebDriver driver;
    public ShoppingcartPage(WebDriver driver)
    {
        this.driver= driver;
    }

    private By quantityTextbox = By.xpath("//input[@class='qty-input']");
    private By termsAndConditionsCheckbox = By.xpath("//input[@id='termsofservice']");
    private By checkoutButton = By.id("checkout");



    public void enterQuantity(String quantity)
    {
        driver.findElement(quantityTextbox).clear();
        driver.findElement(quantityTextbox).sendKeys(quantity);
    }

    public void clickTermsAndConditionsCheckbox()
    {
        driver.findElement(termsAndConditionsCheckbox).click();
    }

    public void clickCheckoutButton()
    {

        driver.findElement(checkoutButton).click();

    }
}
