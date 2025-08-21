package StepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {
	WebDriver driver;
	@Given("Home page should be open in default browser")
	public void home_page_should_be_open_in_default_browser() {
		driver = new ChromeDriver();
	    driver.get("http://zero.webappsecurity.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("^click on search bar and the (.*) and click enter$")
	public void click_on_search_bar_and_the_online_banking_and_click_enter(String item) {
		Pageclass pg = new Pageclass(driver);
	    pg.searching(item);
	}

	@Then("verify search functionality")
	public void verify_search_functionality() {
	    driver.quit();
	}

}
