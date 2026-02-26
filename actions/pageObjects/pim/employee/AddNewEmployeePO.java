package pageObjects.pim.employee;

import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;

public class AddNewEmployeePO {
    private WebDriver driver;

    public AddNewEmployeePO(WebDriver driver){
        this.driver = driver;
    }

    public void enterToFirstNameTextbox(String s) {
    }

    public void enterToMiddleNameTextbox(String s) {
    }

    public void enterToLastNameTextbox(String s) {
    }

    public String getEmployeeID() {
        return "";
    }

    public PersonalDetailsPO clickToSaveButton() {
        return PageGenerator.getPersonalDetailsPage(driver);
    }
}
