package pages.adminarea;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class DashboardCategoriesPage extends BasePage {
    @FindBy(css = "ul[class='breadcrumb']")
    private static WebElement categoriesSection;

    static {
        PageFactory.initElements(Browser.driver, DashboardCategoriesPage.class);
    }

    public static WebElement getCategoriesSection() {
        return categoriesSection;
    }
}
