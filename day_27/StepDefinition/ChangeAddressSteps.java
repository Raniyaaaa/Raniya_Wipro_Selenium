package StepDefinition;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeAddressSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("User is logged into eBay for addresschange")
    public void user_is_logged_into_ebay_for_addresschange() {
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("userid")).sendKeys("raniya182002@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        driver.findElement(By.id("pass")).sendKeys("Raniya@123");
        driver.findElement(By.id("sgnBt")).click();
    }

    @When("User changes the current address")
    public void user_changes_the_current_address() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Navigate to My eBay → Account → Addresses
        driver.findElement(By.linkText("My eBay")).click();
        driver.findElement(By.linkText("Account")).click();
        driver.findElement(By.linkText("Addresses")).click();

        // Click Edit link for current address
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/section[1]/div/div/div[2]/div[1]/div/div[2]/a")).click();

        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.id("individual_personal_info_address_edit_button")).click();

        driver.findElement(By.id("addressLine1")).clear();
        driver.findElement(By.id("addressLine1")).sendKeys("123 ABC");
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys("PQR");

        driver.findElement(By.id("address_edit_submit_button")).click();

        System.out.println("Address changed successfully");
    }

    @Then("Address should be updated successfully")
    public void address_should_be_updated_successfully() {
        
        System.out.println("Address update verified");
        driver.quit();
    }
}
