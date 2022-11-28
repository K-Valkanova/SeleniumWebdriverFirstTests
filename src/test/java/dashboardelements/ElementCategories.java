package dashboardelements;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.adminarea.AdminDashboardPage;
import pages.adminarea.AdminLoginPage;
import pages.adminarea.DashboardCategoriesPage;

public class ElementCategories extends BaseTest {

    @Test
    public static void verifyElementCategoriesLinkWorks(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("admin", "parola123!");
        AdminDashboardPage.verifyElementCatalogueIsActive();
        Assert.assertTrue(DashboardCategoriesPage.getCategoriesSection().isDisplayed());
    }
}
