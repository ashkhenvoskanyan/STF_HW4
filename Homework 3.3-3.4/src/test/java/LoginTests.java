
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setUsername("ashkhen_voskanyan@edu.aua.am");
        loginPage.setPassword("Password");
//        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
//        assertTrue(secureAreaPage.getAlertText()
//                        .contains("You logged into a secure area!"),
//                "Alert text is incorrect");
    }


}