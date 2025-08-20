//Assignment 1 – Action Class
//Objective: Practice mouse and keyboard interactions.
//Scenario:
//Open the DemoQA site → https://demoqa.com/buttons
//Perform:
//Double Click on “Double Click Me” button.
//Right Click on “Right Click Me” button.
//Single Click on the third “Click Me” button.
//Print the text messages that appear after each click action.
//Extra Challenge:
//Visit https://demoqa.com/dragabble and drag the element from its position to another point.

package day_20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleClick).perform();
		   System.out.println("Double Click Message: " + driver.findElement(By.id("doubleClickMessage")).getText());
		   
		Thread.sleep(3000);
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		Actions act1 = new Actions(driver);
		act1.contextClick(rightClick).perform();
	    System.out.println("Right Click Message: " + driver.findElement(By.id("rightClickMessage")).getText());
	    
	    WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeBtn.click();
        System.out.println("Single Click Message: " + driver.findElement(By.id("dynamicClickMessage")).getText());
	    
        driver.navigate().to("https://demoqa.com/droppable");
        Thread.sleep(2000);
        Actions act2 = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		act2.dragAndDrop(source, target).perform();
	    
	}

}


//Double Click Message: You have done a double click
//Right Click Message: You have done a right click
//Single Click Message: You have done a dynamic click