package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	static WebDriver driver;
	static WebDriverWait wait;
	
	@AfterMethod
	public static void closeBrower() {
		driver.close();
		System.out.println("Browser closed succesfully...");
	}
	
	@BeforeMethod
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Browser launched succesfully...");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 20);
		driver.get("https://www.saucedemo.com/");
	}

	
	
	@Test(priority=1, groups="high")
	public static void doLogin() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]")))
				.sendKeys("secret_sauce");

		Thread.sleep(1000);

		driver.findElement(By.className("submit-button")).click();
	}

	@Test(priority=2, enabled=false)
	public static void demoTest() {
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl());
		System.out.println("Demo test executed succesfully...");
	}
}
