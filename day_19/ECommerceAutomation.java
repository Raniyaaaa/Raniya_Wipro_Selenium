package day_19;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerceAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.saucedemo.com/");
            Thread.sleep(2000);
            
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click();
            Thread.sleep(2000);
            System.out.println("Login Successfully !!");
            
            
            Thread.sleep(3000);
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            Thread.sleep(3000);
            WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
            if (removeButton.isDisplayed()) {
                System.out.println("Product added to cart successfully!");
            } else {
                System.out.println("Product not added to cart.");
            }
            Thread.sleep(2000);
            
            driver.findElement(By.id("shopping_cart_container")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("checkout")).click();
            Thread.sleep(2000);
            WebElement fname = driver.findElement(By.id("first-name"));
            fname.click();
            fname.sendKeys("Raniya");
            WebElement lname = driver.findElement(By.id("last-name"));
            lname.click();
            lname.sendKeys("Rasheed");
            WebElement zip = driver.findElement(By.id("postal-code"));
            zip.click();
            zip.sendKeys("123456");
            Thread.sleep(3000);
            driver.findElement(By.id("continue")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("finish")).click();
            Thread.sleep(2000);
            String confirmationMsg = driver.findElement(By.className("complete-header")).getText();
            if (confirmationMsg.contains("Thank you for your order!")) {
                System.out.println("Order placed successfully!");
            } else {
                System.out.println("Order confirmation not found.");
            }
            driver.findElement(By.id("back-to-products")).click();
            Thread.sleep(2000);
            
            
            driver.findElement(By.className("bm-burger-button")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("logout_sidebar_link")).click();
            System.out.println("Logged out Successfully!");
            
            
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
