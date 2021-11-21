package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void handleDragAndDrop(WebDriver driver) throws InterruptedException {
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		//Element which needs to drag.    		
    	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		
    	//Element on which need to drop.		
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
    	
        
        Actions action = new Actions(driver);
        action.dragAndDrop(From, To).build().perform();
        
		Thread.sleep(1000);
//		driver.close();
	}
}
