package pageObjects.pim.employee;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;

public class AddNewEmployeePO extends BasePage {
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
        waitAllLoadingIconInvisible(driver);
        return PageGenerator.getPersonalDetailsPage(driver);
    }
}
