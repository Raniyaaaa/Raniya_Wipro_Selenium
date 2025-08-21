package StepDefinition;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveFromCartSteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("User is logged into eBay for removing")
    public void user_is_logged_into_ebay_for_removing() {
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

    @When("User removes the product from cart")
    public void user_removes_the_product_from_cart() {
        driver.get("https://cart.ebay.com/");
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button[data-test-id='cart-remove-item']"))).click();

        System.out.println("Product removed successfully");
    }

    @Then("Cart should be empty after removal")
    public void cart_should_be_empty_after_removal() {
        
        driver.quit();
    }
}
