package testing_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class DependentTests {
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

    @Test
    public void loginTest() throws InterruptedException {
        pg.login_in();
    }

    @Test(dependsOnMethods = {"loginTest"})
    public void searchTest() {
        pg.searchMultipleItems_in();
    }

    @Test(dependsOnMethods = {"searchTest"})
    public void logoutTest() {
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button"))).perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[3]"))).click();
        System.out.println("Successfully logged out!");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}