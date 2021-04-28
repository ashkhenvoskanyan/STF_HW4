package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private final WebDriver driver;
    private By AddAlertButton = By.className("btn text-white our-bg-color1 va-middle");
    private By DeleteAlertButton = By.className("confirm evt-del btn btn-link shadow-none float-right filterH6");

    public AlertsPage(WebDriver driver) {
        this.driver = driver; 
    }

    public void clickAddAlert(){
        driver.findElement(AddAlertButton).click();
    }

    public void clickDelete(){
        driver.findElement(DeleteAlertButton).click();
    }
}


