package pageObjects.employee;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class AddEmployeePO extends BasePage {

    private WebDriver driver;

    public AddEmployeePO(WebDriver driver){
        this.driver = driver;
    }
}
