package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;

public abstract class BaseTest {

    @BeforeMethod
    protected static void setupBrowser() {
        Browser.setup();
    }

    @AfterMethod
    protected static void quitBrowser() {
        Browser.quit();
    }

}
