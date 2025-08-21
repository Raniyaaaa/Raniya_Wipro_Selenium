package StepDefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RightClickSteps {
	WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    

	@Given("User launches the eBay application rightclick")
	public void user_launches_the_ebay_application_rightclick() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.get("https://www.ebay.com/");
	    actions = new Actions(driver);
	}

	@When("User right clicks on a product image")
	public void user_right_clicks_on_a_product_image() {
	    driver.findElement(By.id("gh-ac")).clear();
	    driver.findElement(By.id("gh-ac")).sendKeys("Wrist Watch");
	    driver.findElement(By.id("gh-search-btn")).click();
	    WebElement productImage = wait.until(ExpectedConditions.presenceOfElementLocated(
	        By.xpath("//*[@id=\"item2b24cf1791\"]/div/div[1]/div/a/div/img")));
	    actions.contextClick(productImage).perform();
	    String description = productImage.getAttribute("alt");
	    System.out.println("Product description: " + description);
	}

	@Then("Right click action should be performed")
	public void right_click_action_should_be_performed() {
	    System.out.println("Right clicked image successfully");
	    driver.quit();
	}

}
