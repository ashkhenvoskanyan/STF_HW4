package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyApplicationsPage  {

    private final WebDriver driver;
    private By searchField = By.className("search form-control rounded search-query p-3");
    private By searchButton = By. className("d-none d-sm-inline");
    private By result = By.className("row");

    public MyApplicationsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSearch(){
        driver.findElement(searchButton).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(result)));
    }

}
