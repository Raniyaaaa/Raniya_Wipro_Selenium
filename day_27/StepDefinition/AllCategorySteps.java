package StepDefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AllCategorySteps {
	WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    
	@Given("User launches the eBay application allcategory")
	public void user_launches_the_ebay_application_allcategory() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.get("https://www.ebay.com/");
	    actions = new Actions(driver);
	}

	@When("User views all categories")
	public void user_views_all_categories() {
	    driver.findElement(By.id("gh-ac")).clear();
	    driver.findElement(By.className("gh-search-categories")).click();
	    driver.findElement(By.cssSelector("#gh-cat > option:nth-child(1)")).click();
	    driver.findElement(By.id("gh-search-btn")).click();
	}

	@Then("All categories should be displayed")
	public void all_categories_should_be_displayed() {
	    System.out.println("All categories page displayed");
	    driver.quit();
	}

}
