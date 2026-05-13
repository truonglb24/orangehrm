package pageObjects.pim.employee;

import commons.BasePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import pageUIs.pim.employee.PersonalDetailsPUI;

public class PersonalDetailsPO extends BasePage {
    private WebDriver driver;

    public PersonalDetailsPO(WebDriver driver){
        this.driver = driver;
    }

    public void clickToEmployeeAvatarImage(){
        waitForElementClickable(driver, PersonalDetailsPUI.EMPLOYEE_IMAGE);
        clickToElement(driver, PersonalDetailsPUI.EMPLOYEE_IMAGE);
    }

    public Dimension getAvatarSize(){
        waitForElementVisible(driver, PersonalDetailsPUI.EMPLOYEE_IMAGE);
        return getElementSize(driver, PersonalDetailsPUI.EMPLOYEE_IMAGE);
    }

    public void clickToSaveButtonAtProfileContainer(){
        waitForElementClickable(driver, PersonalDetailsPUI.BUTTON_SAVE_AT_PROFILE_CONTAINER);
        clickToElement(driver, PersonalDetailsPUI.BUTTON_SAVE_AT_PROFILE_CONTAINER);
    }

    public boolean isSuccessMessageIsDisplayed(){
        waitForElementVisible(driver, PersonalDetailsPUI.UPLOAD_SUCCESS_MESSAGE);
        return isElementDisplayed(driver, PersonalDetailsPUI.UPLOAD_SUCCESS_MESSAGE);
    }

    public boolean isProfileAvatarUpdateSuccess(Dimension beforeUpload){
        Dimension afterUpload = getAvatarSize();
        return !(beforeUpload.equals(afterUpload));
    }
}
