package pages.adminarea;


import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;


public class AdminDashboardPage extends BasePage {

    @FindBy(xpath = "//*[@id='button-developer']/../following-sibling::h1")
    private static WebElement dashboardHeading;

    static {
        PageFactory.initElements(Browser.driver, AdminDashboardPage.class);
    }

    /**
     * Asserts that the title of the Dashboard page equals the provided as parameter
     *
     * @param expectedDashboardTitle the expected dashboard page title as a String
     */
    public static void verifyDashboardTitle(String expectedDashboardTitle) {
        Assert.assertEquals(Browser.driver.getTitle(), expectedDashboardTitle);
    }

    /**
     * Asserts that the text of the heading in the Dashboard page
     * equals the provided as parameter
     *
     * @param expectedDashboardHeadingText the expected dashboard heading text
     * @param messageOnTestFailure the message that will appear in your test reports in case of failure
     */
    public static void verifyDashboardHeadingText(String expectedDashboardHeadingText, String messageOnTestFailure) {
        Assert.assertEquals(dashboardHeading.getText(), expectedDashboardHeadingText, messageOnTestFailure);
    }

    @FindBy(css = "a[class='parent collapsed']>i[class='fa fa-tags fw']")
    private static WebElement catalogueElementIcon;
    @FindBy(css = "ul[id='collapse1'][aria-expanded='true']")
    private static WebElement catalogueDropDownMenu;

    @FindBy(xpath = "//*[@id='menu-catalog']/a")
    private static  WebElement catalogueElementText;

    public static void verifyElementCatalogueIsPresent(String expectedElementName){
        Assert.assertEquals(catalogueElementText.getText(), expectedElementName);
    }

    public static void verifyElementCatalogueIsActive(){
        catalogueElementIcon.click();
        Assert.assertTrue(catalogueDropDownMenu.isDisplayed());
    }

    @FindBy(css = "ul[id='collapse1']>li>a[href='https://shop.pragmatic.bg/admin/index.php?route=catalog/category&user_token=jgP0qAssFNPyuufUMoCvtfrOHkqLqrOI']")
    private static WebElement categoriesElement;

    public static void verifyElementCategoriesLinkIsActive(){
        categoriesElement.click();
    }
}

