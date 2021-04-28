package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    private WebDriver driver;
    private By AlertsButton = By.className("btn text-white shadow-none w-100 text-left mb-1 dashboard-prof-item dashboard-prof-active font-weight-bold");
    private By MyApplicationsButton = By.className("btn text-white shadow-none w-100 text-left mb-1 dashboard-prof-item dashboard-prof-active font-weight-bold");


    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }

    public  AlertsPage clickAlertsButton(){
        driver.findElement(AlertsButton).click();
        return new AlertsPage(driver);
    }

    public  MyApplicationsPage clickMyApplicationsButton(){
        driver.findElement(MyApplicationsButton).click();
        return new MyApplicationsPage(driver);
    }

}
