package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginButton = By.className("btn our-bg-color1 text-white px-4");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public  ProfilePage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new ProfilePage(driver);
    }
}