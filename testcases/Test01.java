import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.DashboardP0;
import pageObjects.LoginPO;
import pageObjects.PageGenerator;

public class Test01 extends BaseTest {
    WebDriver driver;
    private LoginPO loginPage;
    private DashboardP0 dashboardPage;
    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass (String browserName, String url){
        driver = getBrowserDriver(browserName, url);
    }

    @Test
    public void Test01(){
        loginPage = PageGenerator.getLoginPage(driver);
        loginPage.enterToUsernameTextbox("truonglb");
        loginPage.enterToPasswordTextbox("WrPvX$W64><o-5");
        dashboardPage = loginPage.clickToLoginButton();
    }

//    @AfterTest
//    public void afterClass() {
//        driver.quit();
//    }
}
