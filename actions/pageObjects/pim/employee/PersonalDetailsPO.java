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
        waitForElementVisible(driver, PersonalDetailsPUI.EDIT_EMPLOYEE_IMAGE);
        clickToElement(driver, PersonalDetailsPUI.EDIT_EMPLOYEE_IMAGE);
    }

    public Dimension getAvatarSize(){
        waitForElementVisible(driver, PersonalDetailsPUI.AVATAR_IMG);
        return getElement(driver,PersonalDetailsPUI.AVATAR_IMG).getSize();
    }

    public void clickToSaveButtonAtProfileContainer(){
        waitForElementVisible(driver, PersonalDetailsPUI.BUTTON_SAVE_AT_PROFILE_CONTAINER);
        clickToElement(driver, PersonalDetailsPUI.BUTTON_SAVE_AT_PROFILE_CONTAINER);
    }

    public boolean isSuccessMessageIsDisplayed(String message){
        waitForElementVisible(driver, PersonalDetailsPUI.UPLOAD_SUCCESS_MESSAGE);
        return getElementText(driver, PersonalDetailsPUI.UPLOAD_SUCCESS_MESSAGE).equals(message);
    }

    public boolean isProfileAvatarUpdateSuccess(Dimension beforeUpload,Dimension afterUpload){
        return (beforeUpload.getHeight() == afterUpload.getHeight())
                && (beforeUpload.getWidth() == afterUpload.getWidth());
    }
}
