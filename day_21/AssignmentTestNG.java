package testing_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class AssignmentTestNG {
    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    @Test(priority = 1)
    public void Login() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("userid")).sendKeys("raniya182002@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        driver.findElement(By.id("pass")).sendKeys("Raniya@123");
        driver.findElement(By.id("sgnBt")).click();
        System.out.println("Login test executed");
    }

    @Test(priority = 2)
    public void MultipleSearches() {
        ArrayList<String> products = new ArrayList<>();
        products.add("Watch");
        products.add("Pen");
        products.add("Laptop");

        for (String product : products) {
            WebElement searchBox = driver.findElement(By.id("gh-ac"));
            searchBox.clear();
            searchBox.sendKeys(product, Keys.ENTER);
            System.out.println("Searched for: " + product);
            driver.navigate().back();
        }
    }

    @Test(priority = 3)
    public void testAddToCart() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.id("gh-ac")).clear();
        driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
        driver.findElement(By.id("gh-search-btn")).click();

        driver.get("https://www.ebay.com/itm/326013509564?_skw=laptop");
        js.executeScript("window.scrollBy(0,300)");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("atcBtn_btn_1"))).click();
        System.out.println("Product added to cart");

        driver.get("https://cart.ebay.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-test-id='cart-remove-item']"))).click();
        System.out.println("Product removed from cart");
    }

	@Test
	public void testChangeLoginName() throws InterruptedException {
		  Thread.sleep(3000);
	    driver.findElement(By.linkText("My eBay")).click();
	    driver.findElement(By.linkText("Account")).click();
	    driver.findElement(By.id("account-settings-link-PI")).click();
	    driver.findElement(By.id("individual_username_edit_button")).click();
	    driver.findElement(By.id("user_name")).clear();
	    driver.findElement(By.id("user_name")).sendKeys("Raniyaaaa");
	    driver.findElement(By.id("")).click();
	    System.out.println("Login name changed");
	    driver.navigate().refresh();
	    Thread.sleep(3000);
	}
  
    @Test(priority = 4)
    public void testChangeCurrentAddress() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.linkText("My eBay")).click();
        driver.findElement(By.linkText("Account")).click();
        driver.findElement(By.linkText("Addresses")).click();
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/section[1]/div/div/div[2]/div[1]/div/div[2]/a")).click();

        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
        driver.findElement(By.id("addressLine1")).clear();
        driver.findElement(By.id("addressLine1")).sendKeys("123 ABC");
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys("PQR");
        driver.findElement(By.id("address_edit_submit_button")).click();
        System.out.println("Address changed");
    }

    @Test(priority = 5)
    public void testShopByAllCategories() {
        driver.findElement(By.id("gh-ac")).clear();
        driver.findElement(By.className("gh-search-categories")).click();
        driver.findElement(By.cssSelector("#gh-cat > option:nth-child(1)")).click();
        driver.findElement(By.id("gh-search-btn")).click();
        System.out.println("All categories page displayed");
    }

    @Test(priority = 6)
    public void testShopByCategories() {
        driver.findElement(By.className("gh-search-categories")).click();
        driver.findElement(By.cssSelector("#gh-cat > option:nth-child(3)")).click();
        driver.findElement(By.id("gh-search-btn")).click();
        System.out.println("Navigated to Art category");
    }

    @Test(priority = 7)
    public void testRightClickOnProductImage() {
        driver.findElement(By.id("gh-ac")).clear();
        driver.findElement(By.id("gh-ac")).sendKeys("Wrist Watch");
        driver.findElement(By.id("gh-search-btn")).click();

        WebElement productImage = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//*[@id=\"item2b24cf1791\"]/div/div[1]/div/a/div/img")));
        actions.contextClick(productImage).perform();
        String description = productImage.getAttribute("alt");
        System.out.println("Product description: " + description);
        System.out.println("Right clicked image");
        driver.navigate().refresh();
    }

    @Test(priority = 8)
    public void testChangeLanguage() {
        driver.findElement(By.linkText("My eBay")).click();
        driver.findElement(By.linkText("Account")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        WebElement country = driver.findElement(By.cssSelector("button[class='gf-flag__button']"));
        country.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Korea"))).click();
        System.out.println("Language changed to Korean");
    }

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        actions = new Actions(driver);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}


//Login test executed
//Searched for: Watch
//Searched for: Pen
//Searched for: Laptop
//Product added to cart
//Product removed from cart
//Address changed
//All categories page displayed
//Navigated to Art category
//Product description: Men's Army Military Luminous 24 Hours Dial Nylon Strap Date Quartz Wrist Watch
//Right clicked image
//Language changed to Korean
//PASSED: testing_package.AssignmentTestNG.testAddToCart
//PASSED: testing_package.AssignmentTestNG.MultipleSearches
//PASSED: testing_package.AssignmentTestNG.Login
//PASSED: testing_package.AssignmentTestNG.testShopByAllCategories
//PASSED: testing_package.AssignmentTestNG.testRightClickOnProductImage
//PASSED: testing_package.AssignmentTestNG.testChangeCurrentAddress
//PASSED: testing_package.AssignmentTestNG.testShopByCategories
//PASSED: testing_package.AssignmentTestNG.testChangeLanguage
//
//===============================================
//    Default test
//    Tests run: 8, Failures: 0, Skips: 0
//===============================================
//
//
//===============================================
//Default suite
//Total tests run: 8, Passes: 8, Failures: 0, Skips: 0
//===============================================
