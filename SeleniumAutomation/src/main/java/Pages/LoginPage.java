package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

//	POM
//	By loginLogo = By.xpath("//*[@id=\"root\"]/div/div[1]");
	By botLogo = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]");
	By userName = By.id("user-name");
	By password = By.xpath("//*[@id=\"password\"]");
	By submitButton = By.className("submit-button");
	
//	PageFactory
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]")
	WebElement loginLogo;
	
//	POM Method
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void doLogin() throws InterruptedException {
		driver.findElement(userName).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(password).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(submitButton).click();
	}

//	public void verifyLoginLogoDisplayed() {
//		WebElement lLogo = driver.findElement(loginLogo);
//		assertTrue(lLogo.isDisplayed());
//	}

//	Using PageFactory
	public void verifyBotLogoDisplayed() {
		WebElement bLogo = driver.findElement(botLogo);
		assertTrue(bLogo.isDisplayed());
	}
	
	public void verifyLoginLogoDisplayedPFactory() {
	assertTrue(loginLogo.isDisplayed());
}
}
