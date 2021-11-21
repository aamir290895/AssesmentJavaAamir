package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPagePOMTests {
	static WebDriver driver;
	static WebDriverWait wait;

	@AfterMethod
	public void closeBrower() {
		driver.close();
		System.out.println("Browser closed succesfully...");
	}

	@BeforeMethod
	public void setup() throws IOException {
		String browser;
		String loginPageURL;

		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\Workspace\\SeleniumAutomation\\src\\test\\resources\\config.properties");
		config.load(fis);
		browser = config.getProperty("browser");
		loginPageURL = config.getProperty("loginPageURL");

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Browser launched succesfully...");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, 20);
			driver.get(loginPageURL);
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Browser launched succesfully...");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, 20);
			driver.get(loginPageURL);
		}
	}

	@Test
	public void loginTest() throws InterruptedException {
		String expectedURL = "https://www.saucedemo.com/inventory.html";

		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin();

		String actualURL = driver.getCurrentUrl();

		Assert.assertEquals(actualURL, expectedURL);
	}

//	@Test
//	public void verifyLoginLogo() {
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.verifyLoginLogoDisplayed();
//	}

	@Test(enabled = false)
	public void verifyBotLogo() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.verifyBotLogoDisplayed();
	}

	@Test(enabled = false)
	public void verifyLoginLogoPF() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.verifyLoginLogoDisplayedPFactory();
	}
}
