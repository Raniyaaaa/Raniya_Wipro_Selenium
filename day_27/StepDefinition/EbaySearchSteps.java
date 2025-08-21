package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class EbaySearchSteps {
    WebDriver driver;

    @Given("User launches the eBay application")
    public void user_launches_the_e_bay_application() {
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
    	
    }
    
    @When("^User searches multiple products$")
    public void user_searches_multiple_products() {
        ArrayList<String> products = new ArrayList<>();
        products.add("Watch");
        products.add("Pen");
        products.add("Laptop");

        for (String product : products) {
            WebElement searchBox = driver.findElement(By.id("gh-ac"));
            searchBox.clear();
            searchBox.sendKeys(product, Keys.ENTER);
            System.out.println("Searched: " + product);
            driver.navigate().back();
        }
    }

    @Then("^Products should be searched$")
    public void products_should_be_searched() {
        System.out.println("Search executed successfully");
        driver.quit();
    }
}

