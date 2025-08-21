package StepDefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class EbayLoginSteps {
	WebDriver driver;
    WebDriverWait wait;

    @Given("User launches the eBay application for login")
    public void user_launches_the_e_bay_application_for_login() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
    }

    @When("^User logs in with username (.*) and password (.*)$")
    public void user_logs_in_with_username_username_and_password_password(String username, String password) {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("userid")).sendKeys(username);
        driver.findElement(By.id("signin-continue-btn")).click();
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("sgnBt")).click();
    }

    @Then("Login should be successful")
    public void login_should_be_successful() {
        System.out.println("Login successful");
    }
}
