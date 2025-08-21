package StepDefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LanguageSteps {
	WebDriver driver;
    WebDriverWait wait;
    Actions actions;

	@Given("User launches the eBay application language")
	public void user_launches_the_ebay_application_language() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.get("https://www.ebay.com/");
	    actions = new Actions(driver);
	}

	@When("^User changes language (.*)$")
	public void user_changes_language_lang(String lang) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,700)");
	    WebElement country = driver.findElement(By.cssSelector("button[class='gf-flag__button']"));
	    country.sendKeys(Keys.ENTER);
	    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(lang))).click();
	}

	@Then("Language should be changed")
	public void language_should_be_changed() {
	    System.out.println("Language changed");
	    driver.quit();
	}

}
