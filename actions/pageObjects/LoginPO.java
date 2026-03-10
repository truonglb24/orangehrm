package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.LoginPUI;

public class LoginPO extends BasePage {

    private WebDriver driver;

    public LoginPO(WebDriver driver){
        this.driver = driver;
    }

    public void enterToUsernameTextbox(String username) {
        // TODO
        clearInput(driver, LoginPUI.USERNAME_TEXTBOX);
        sendkeyToElement(driver, LoginPUI.USERNAME_TEXTBOX, username);
    }

    public void enterToPasswordTextbox(String password) {
        // TODO
        clearInput(driver, LoginPUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPUI.PASSWORD_TEXTBOX, password);
    }


    public DashboardP0 clickToLoginButton() {
        // TODO
        clickToElement(driver, LoginPUI.BUTTON_LOGIN);
        return PageGenerator.getDashboardPage(driver);
    }
}
