package StepsDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {
	WebDriver driver;
	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
	    driver = new ChromeDriver();
	    driver.get("http://zero.webappsecurity.com/login.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("^click on login button and enter(.*) and (.*)$")
	public void click_on_login_button_and_enter_username1_and_password1(String username1, String password1) {
		Pageclass pg = new Pageclass(driver);
		pg.login(username1, password1);
	}

	@Then("login successfully and open home page")
	public void login_successfully_and_open_home_page() {
		System.out.println("login checked!!");
		driver.quit();
	}
}
