package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {
	public static void handleCheckboxe(WebDriver driver) throws InterruptedException {

		driver.get("http://www.calculator.net/mortgage-calculator.html");
		driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText());
		Thread.sleep(3000);
		driver.close();
	}
}
