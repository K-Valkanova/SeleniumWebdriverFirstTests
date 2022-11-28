package adminarea.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.adminarea.AdminDashboardPage;
import pages.adminarea.AdminLoginPage;


public class AminLoginTests extends BaseTest {

    @Test
    public static void loginByUsingCorrectUsernameAndCorrectPassword(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("admin", "parola123!");
        AdminDashboardPage.verifyDashboardHeadingText("Dashboard",
                "The heading of the dashboard is different from the expected one.");
    }

    @Test
    public static void verifyTheDashboardTitle(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("admin", "parola123!");
        AdminDashboardPage.verifyDashboardTitle("Dashboard");
    }

}
