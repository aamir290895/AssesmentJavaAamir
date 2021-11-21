package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllLinks {

	public static void displayAllLinks(WebDriver driver) {
		driver.get("https://www.calculator.net/");
		List<WebElement> wb = driver.findElements(By.tagName("a"));
		System.out.println(wb.size());
		
		for(int i=0;i<wb.size();i++) {
			WebElement w=wb.get(i);
			System.out.println(w.getText());
			System.out.println(w.getAttribute("href"));
		}
	}

}
