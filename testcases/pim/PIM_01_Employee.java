package pim;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PIM_01_Employee extends BaseTest {
    private WebDriver driver;

    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass (String browserName, String url){
        driver = getBrowserDriver(browserName, url);
    }
    @Test
    public void Employee_01_Add_New_Employee(){

    }
    @Test
    public void Employee_01_Upload_Avatar(){

    }
    @Test
    public void Employee_01_Personal_Details(){

    }
    @Test
    public void Employee_01_Contact_Details(){

    }
    @Test
    public void Employee_01_Emergency_Details(){

    }
    @Test
    public void Employee_01_Assigned_Dependents(){

    }
    @Test
    public void Employee_01_Edit_View_Job(){

    }
    @Test
    public void Employee_01_Edit_View_Salary(){

    }
    @Test
    public void Employee_01_Edit_View_Tax(){

    }
    @Test
    public void Employee_01_Qualifications(){

    }
    @Test
    public void Employee_01_Search_Employee(){

    }


    @AfterClass
    public void afterClass (){
        closeBrowserDriver();
    }
}
