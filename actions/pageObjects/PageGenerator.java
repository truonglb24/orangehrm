package pageObjects;

import org.openqa.selenium.WebDriver;
import pageObjects.pim.employee.ContactDetailPO;
import pageObjects.pim.employee.EmergencyContactsPO;
import pageObjects.pim.employee.EmployeeListPO;
import pageObjects.pim.employee.PersonalDetailsPO;

public class PageGenerator {
    // Init page
    public static LoginPO getLoginPage(WebDriver driver){
        return new LoginPO(driver);
    }

    public static ContactDetailPO getContactDetailPage(WebDriver driver){
        return new ContactDetailPO(driver);
    }

    public static EmergencyContactsPO getEmergencyContactsPage(WebDriver driver){
        return new EmergencyContactsPO(driver);
    }

    public static EmployeeListPO getEmployeeListPage(WebDriver driver){
        return new EmployeeListPO(driver);
    }

    public static PersonalDetailsPO getPersonalDetailsPage(WebDriver driver){
        return new PersonalDetailsPO(driver);
    }
}
