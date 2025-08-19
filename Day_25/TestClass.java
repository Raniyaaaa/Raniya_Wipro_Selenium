package testing_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class TestClass {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    PageClass pg;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
        pg = new PageClass(driver, wait, actions);
        driver.get("https://www.ebay.com/");
    }

    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        pg.login_in();
    }

    @Test(priority = 2)
    public void testMultipleSearches() {
        pg.searchMultipleItems_in();
    }

    @Test(priority = 3)
    public void testAddToCart() {
        pg.addToCart();
    }

    @Test(priority = 4)
    public void testRemoveFromCart() {
    	pg.addToCart();
        pg.removeFromCart();
    }

    @Test(priority = 5)
    public void testChangeAddress() {
        pg.changeAddress();
    }

    @Test(priority = 6)
    public void testShopAllCategories() {
        pg.shopAllCategories();
    }

    @Test(priority = 7)
    public void testShopByCategory() {
        pg.shopByCategory();
    }

    @Test(priority = 8)
    public void testRightClickOnProduct() {
        pg.rightClickOnProduct();
    }

    @Test(priority = 9)
    public void testChangeLanguage() {
        pg.changeLanguage();
    }

    @AfterTest
    public void afterTest() {
//        driver.quit();
    }
}
