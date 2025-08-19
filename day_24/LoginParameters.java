package testing_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginParameters {
	WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        actions = new Actions(driver);
        driver.get("https://www.ebay.com/");
    }

    
    @Parameters({"username", "password"})
    @Test
    public void loginWithParameters(@Optional("raniya182002@gmail.com") String username, @Optional("Raniya@123") String password) throws InterruptedException {
    	driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("userid")).sendKeys(username);
        driver.findElement(By.id("signin-continue-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("sgnBt")).click();
        System.out.println("Login test executed");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
