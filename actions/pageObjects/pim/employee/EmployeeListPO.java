package pageObjects.pim.employee;

import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;

public class EmployeeListPO {
    private WebDriver driver;

    public EmployeeListPO(WebDriver driver){
        this.driver = driver;
    }

    public AddNewEmployeePO clickToAddNewEmployeeButton() {
        return PageGenerator.getAddNewEmployeePage(driver);
    }
}
