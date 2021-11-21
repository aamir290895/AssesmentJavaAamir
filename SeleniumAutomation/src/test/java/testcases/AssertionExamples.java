package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExamples {
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

	@Test(enabled=false)
	public static void assertionExample1() {

		String actualTitle = "DashbOard";
		String expectedTitle = "Dashboard";

//		if (actualTitle.equals(expectedTitle)) {
//			System.out.println("Test passed succesfully");
//		}else {
//			System.out.println("Test failed");
//		}
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public static void verifyLoginSuccesful() throws InterruptedException {
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		
//		DoLogin
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]")))
				.sendKeys("secret_sauce");

		Thread.sleep(1000);

		driver.findElement(By.className("submit-button")).click();
		
//		Extract pageURL
		String actualURL = driver.getCurrentUrl();
		
//		Assertion
		Assert.assertEquals(actualURL, expectedURL);
	}

	@Test(enabled=false)
	public static void skipTestExample() {
		throw new SkipException("Skipping the test");
	}
	
	@Test
	public static void assertTrueExample() {
		WebElement botLogo = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]"));
		
		Assert.assertTrue(botLogo.isDisplayed());
	}
	
	@Test
	public static void failTestExample() {
		int age = 19;
		if(age>=18) {
			System.out.println("Congratulations! You are eligible for voting...");
			Assert.assertTrue(true);
		}else {
			System.out.println("Sorry! You are not eligible for voting...");
			Assert.fail();
		}
	}
	
	@Test
	public static void hardAssertExample() {
		String actualTitle = "Dashboard";
		String expectedTitle = "Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("HelloWorld!");
	}
	
	@Test
	public static void softAssertExample() {
		SoftAssert sAssert = new SoftAssert();
		String actualTitle = "DashbOard";
		String expectedTitle = "Dashboard";
		sAssert.assertEquals(actualTitle, expectedTitle);
		System.out.println("HelloWorld!");
		sAssert.assertAll();
	}
	
}
