package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPO extends BasePage {

    private WebDriver driver;

    public LoginPO(WebDriver driver){
        this.driver = driver;
    }

    public void enterToUsernameTextbox(String username) {
        // TODO
    }

    public void enterToPasswordTextbox(String password) {
        // TODO
    }


    public DashboardP0 clickToLoginButton() {
        // TODO
        return PageGenerator.getDashboardPage(driver);
    }
}
