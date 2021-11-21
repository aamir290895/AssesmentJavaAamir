package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtons {
	public static void handleRadioButton(WebDriver driver) throws InterruptedException {
		driver.get("https://www.calculator.net/mortgage-payoff-calculator.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/tbody/tr[5]/td/label[1]")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
