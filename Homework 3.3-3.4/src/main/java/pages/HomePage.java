package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By loginButton = By.className("nav-link navbar-text open-recol job-animate-border from-right px-lg-2 ");
    private By searchfield = By.id("q");
    private By searchbutton = By.className("btn btn-block rounded border-0 btnSearch text-white filterBG");
    private By fileUploadButton = By.className("btn text-white py-2 px-3 px-sm-5 btnColorDark2 shadow");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public  LoginPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

    public FileUploadPage clickfileUploadButton(){
        driver.findElement(fileUploadButton).click();
        return new FileUploadPage(driver);
    }

}