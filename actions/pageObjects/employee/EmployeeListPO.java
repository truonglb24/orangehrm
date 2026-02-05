package pageObjects.employee;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class PIMEmployeePageObject extends BasePage {

    private WebDriver driver;

    public PIMEmployeePageObject(WebDriver driver){
        this.driver = driver;
    }
}
