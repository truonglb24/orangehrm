package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import pageObjects.pim.employee.EmployeeListPO;

public class DashboardP0 extends BasePage {

    private WebDriver driver;

    public DashboardP0(WebDriver driver){
        this.driver = driver;
    }

    public EmployeeListPO clickToPIMPage() {
        return PageGenerator.getEmployeeListPage(driver);
    }
}
