package pageObjects.employee;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class EmployeePersonalDetailPO extends BasePage {

    private WebDriver driver;

    public EmployeePersonalDetailPO(WebDriver driver){
        this.driver = driver;
    }
}
