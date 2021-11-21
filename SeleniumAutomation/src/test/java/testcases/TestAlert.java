package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestAlert {
	public static void handleAlert(WebDriver driver) throws InterruptedException {
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1008");
		driver.findElement(By.name("submit")).click();

//		 Handle Alert
		Alert alert = driver.switchTo().alert();

//		 Print alert message
		String msg = alert.getText();
		System.out.println(msg);
		Thread.sleep(1000);

//		 Accept Alert
		alert.accept();
		Thread.sleep(500);
		
//		Handle New Alert
		Alert alertNew = driver.switchTo().alert();
		
//		AlertNew Message
		System.out.println(alertNew.getText());
		Thread.sleep(500);
		
//		AlertNew Accept
		alertNew.accept();
		Thread.sleep(500);

	}
}
