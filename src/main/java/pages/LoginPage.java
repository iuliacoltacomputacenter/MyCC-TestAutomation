package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.xpath("//form[@id='kt_login_signin_form']/div[2]/div[1]/input[@name='email']");
    private By passwordField = By.xpath("//form[@id='kt_login_signin_form']/div[3]/div[2]/input[@name='password']");
    private By loginButton = By.xpath("/html//form[@id='kt_login_signin_form']//button[.=' Sign In ']");
    private By logTimeButton = By.xpath("//button[contains(text(), 'Log time')]");
   
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage(WebDriver driver, String format) {
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

   
    public Dashboard clickSignInButton(){
    	
//    	setEmail("cctestuser12@yopmail.com") ;
//    	setPassword("CCTest@2021") ;
        driver.findElement(loginButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5)  ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(logTimeButton));
        return new Dashboard(driver);
    }
}
