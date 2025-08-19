package testing_package;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.time.Duration;
public class RunMultipleTimes {
	WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    PageClass pg;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
        pg = new PageClass(driver, wait, actions);
        driver.get("https://www.ebay.com/");
    }

    @Test(priority = 1, invocationCount = 3)
    public void searchMultipleTimes() {
        pg.shopByCategory();
        System.out.println("Search executed");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}