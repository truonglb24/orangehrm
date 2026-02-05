import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test01 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();

        driver.get("https://yasai-test.yakuodo-info.com/login");
    }

    @Test
    public void Test01(){}

    @AfterTest
    public void afterClass() {
        driver.quit();
    }
}
