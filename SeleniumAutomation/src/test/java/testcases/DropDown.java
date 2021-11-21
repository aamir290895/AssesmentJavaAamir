package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void handleDropDown(WebDriver driver) throws InterruptedException {
		driver.get("https://www.calculator.net/interest-calculator.html");
		Thread.sleep(1000);
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"ccompound\"]")));
		dropdown.selectByVisibleText("continuously");
		Thread.sleep(2000);
		driver.close();
	}
}
