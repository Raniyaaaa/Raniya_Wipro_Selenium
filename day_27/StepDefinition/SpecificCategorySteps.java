package StepDefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SpecificCategorySteps {
	WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    @Given("User launches the eBay application specific")
    public void user_launches_the_ebay_application_specific() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        actions = new Actions(driver);
    }

    @When("User selects specific category")
    public void user_selects_specific_category() {
        driver.findElement(By.className("gh-search-categories")).click();
        driver.findElement(By.cssSelector("#gh-cat > option:nth-child(3)")).click();
        driver.findElement(By.id("gh-search-btn")).click();
    }

    @Then("Specific category should be displayed")
    public void specific_category_should_be_displayed() {
        System.out.println("Navigated to Art category");
        driver.quit();
    }

}
