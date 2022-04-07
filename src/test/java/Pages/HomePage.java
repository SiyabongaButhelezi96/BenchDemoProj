package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    WebDriver driver;

    private By booksLink= By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]");
    private By computersLink = By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[2]/a[1]");
    private By addToCart = By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By sortDropdown = By.xpath("//select[@id='products-orderby']");


    public HomePage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void clickDesktopsLink()
    {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(computersLink);
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//a[@href='/desktops']"))).click().build().perform();
    }

    public void setSortDropdown(String sort)
    {
        Select dropdown = new Select(driver.findElement(sortDropdown));
        dropdown.selectByVisibleText(sort);
    }

    public void selectItem()
    {
        driver.findElement(addToCart).click();

    }
}
