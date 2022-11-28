package adminarea.negatve;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.adminarea.AdminLoginPage;

public class AdminLoginTests extends BaseTest {

    @Test
    public static void loginByUsingWrongUsernameAndWrongPassword(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("ldhfdfhdf", "kjfhdsjkfhdsfksh");
        AdminLoginPage.verifyValidationMessage("No match for Username and/or Password.", "wrong error message");
    }


}
