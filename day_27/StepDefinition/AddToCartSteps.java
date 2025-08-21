package StepDefinition;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartSteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("User is logged into eBay for adding")
    public void user_is_logged_into_ebay_for_adding() {
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

    @When("User adds a product to cart")
    public void user_adds_a_product_to_cart() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.clear();
        searchBox.sendKeys("Laptop");
        driver.findElement(By.id("gh-search-btn")).click();
        driver.get("https://www.ebay.com/itm/256776833046?_skw=Laptop&hash=item3bc9178816:g:bZQAAeSwkR5okZdO");

        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("atcBtn_btn_1"))).click();

        System.out.println("Product added successfully");
    }

    @Then("Product should be added to cart")
    public void product_should_be_added_to_cart() {
    	driver.quit();
        
    }
}
