package pageObjects;

import org.openqa.selenium.WebDriver;
import pageObjects.pim.employee.*;

public class PageGenerator {
    // Init page
    public static LoginPO getLoginPage(WebDriver driver){
        return new LoginPO(driver);
    }

    public static DashboardP0 getDashboardPage(WebDriver driver){
        return new DashboardP0(driver);
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

    public static AddNewEmployeePO getAddNewEmployeePage(WebDriver driver){
        return new AddNewEmployeePO(driver);
    }

    public static PersonalDetailsPO getPersonalDetailsPage(WebDriver driver){
        return new PersonalDetailsPO(driver);
    }
}
