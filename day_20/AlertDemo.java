//Assignment 3 – Alerts
//Objective: Handle different types of alerts.
//Scenario:
//Open the DemoQA site → https://demoqa.com/alerts
//Perform:
//Click the button to see an alert, accept it.
//Click the “On button click, confirm box will appear” button, dismiss the alert.
//Click the “Prompt Box” button, enter your name, and accept it.
//Capture and print the alert messages before accepting/dismissing.
//Extra Challenge:
//Wait dynamically for the alert that appears after 5 seconds, then accept it.


package day_20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;

		
		WebElement alertDriver = driver.findElement(By.id("alertButton"));
		alertDriver.click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		
		WebElement timeAlert = driver.findElement(By.id("timerAlertButton"));
		timeAlert.click();
		Thread.sleep(7000);
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		
		Thread.sleep(3000);
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		alert3.dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
		Thread.sleep(4000);
		Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("Raniya");
		alert4.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}

}


//You selected Cancel
//You entered Raniya