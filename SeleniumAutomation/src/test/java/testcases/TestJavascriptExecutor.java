package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestJavascriptExecutor {
	public static void handleScroll(WebDriver driver) {
	
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
		
		js.executeScript("console.log(document.title);");
		
	}
}
