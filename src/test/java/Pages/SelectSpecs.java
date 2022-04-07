package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectSpecs {
    WebDriver driver;

    private By processorDropdown = By.xpath("//select[@id='product_attribute_16_5_4']");
    private By ramDropdown = By.xpath("//select[@id='product_attribute_16_6_5']");
    private By HDDCheckBox = By.xpath("//input[@id='product_attribute_16_3_6_19']");
    private By operatingSystemCheckBox = By.xpath("//input[@id='product_attribute_16_4_7_21']");
    private By addToCart2 = By.xpath("//input[@id='add-to-cart-button-16']");
    private By shoppingCartLinkText = By.xpath("//span[contains(text(),'Shopping cart')]");
    private By productAddedMsg = By.xpath("//a[contains(text(),'shopping cart')]");


    public SelectSpecs(WebDriver driver)
    {
        this.driver= driver;
    }

    public void selectProcessor(int processor)
    {
        Select dropdown = new Select(driver.findElement(processorDropdown));
        dropdown.selectByIndex(processor);

    }

    public void selectRAM(int RAM)  {

        Select dropdown = new Select(driver.findElement(processorDropdown));
        dropdown.selectByIndex(RAM);

    }

    public void selectHDD()
    {
        driver.findElement(HDDCheckBox).click();
    }

    public void selectOS()
    {
        driver.findElement(operatingSystemCheckBox).click();
    }

    public void clickAddToCart()
    {
        driver.findElement(addToCart2).click();
        //Assert.assertTrue(driver.findElement(productAddedMsg).isDisplayed());
    }

    public void clickShoppingCartLinkText()
    {
        driver.findElement(shoppingCartLinkText).click();
    }
}
