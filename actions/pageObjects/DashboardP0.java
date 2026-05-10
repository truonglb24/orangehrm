package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import pageObjects.pim.employee.EmployeeListPO;
import pageUIs.DashboardPUI;

public class DashboardP0 extends BasePage {

    private WebDriver driver;

    public DashboardP0(WebDriver driver){
        this.driver = driver;
    }

    public EmployeeListPO clickToPIMPage() {
        waitForElementVisible(driver, DashboardPUI.PIM_LINK);
        clickToElement(driver, DashboardPUI.PIM_LINK);
        waitAllLoadingIconInvisible(driver);
        return PageGenerator.getEmployeeListPage(driver);
    }
}
