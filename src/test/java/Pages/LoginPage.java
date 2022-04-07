package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //WebDriver declaration
    WebDriver driver;

    //Web elements
    private By loginLink = By.xpath("//a[@href='/login']");
    private By logoutLink = By.xpath("//a[@href='/logout']");
    private By emailTextBox =  By.id("Email");
    private By passwordTextBox =  By.id("Password");
    private By loginButton = By.xpath("//input[@value='Log in']");

    public LoginPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void clickLoginLink()
    {
        driver.findElement(loginLink).click();
    }

    public void enterUsernameAndPassword(String username, String password)
    {
        driver.findElement(emailTextBox).sendKeys(username);
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogin()
    {
        driver.findElement(loginButton).click();
    }

    public void checkLogoutLick()
    {
        driver.findElement(logoutLink).isDisplayed();
    }



}
