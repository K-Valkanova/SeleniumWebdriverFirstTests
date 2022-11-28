package dashboardelements;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.adminarea.AdminDashboardPage;
import pages.adminarea.AdminLoginPage;

public class ElementCatalogue extends BaseTest {

    @Test
    public static void verifyElementsCatalogueName(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("admin", "parola123!");
        AdminDashboardPage.verifyElementCatalogueIsPresent("Catalog");
    }

    @Test
    public static void verifyElementCatalogueIsActive(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("admin", "parola123!");
        AdminDashboardPage.verifyElementCatalogueIsActive();
    }
}
