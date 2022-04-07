package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    private By continueButton = By.xpath("//input[@title='Continue']");

    private By shipAddressButton = By.xpath("//input[@onClick='Shipping.save()']");
    private By shipMethodButton = By.xpath("//input[@onClick='ShippingMethod.save()']");
    private By paymentMethodButton = By.xpath("//input[@onClick='PaymentMethod.save()']");
    private By paymentInformationBtn = By.xpath("//input[@onClick='PaymentInfo.save()']");

    private By confirmOrderButton = By.xpath("//input[@value='Confirm']");
    private By confirmationMsg = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");


    public CheckoutPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickContinueButton()
    {
        driver.findElement(continueButton).click();

    }

    public void clickShipButton()
    {
        driver.findElement(shipAddressButton).click();
        driver.findElement(shipMethodButton).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(paymentMethodButton).click();
        driver.findElement(paymentInformationBtn).click();


    }

    public void clickConfirmOrderButton()
    {
        driver.findElement(confirmOrderButton).click();
        String msg =driver.findElement(confirmationMsg).getText();
        System.out.println(msg);
        Assert.assertEquals("Your order has been successfully processed!",msg.toString());

    }

}
