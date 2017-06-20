package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.*;

public class Test_Steps {
	public static WebDriver driver;
	
	@Given("^Browser is launched$")
	public void browser_is_launched() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//hdesetti//Downloads//chromedriver//chromedriver.exe");	
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^gmail url is entered$")
	public void gmail_url_is_entered() throws Throwable {
		driver.get("https://gmail.com");
		
	}

	@Then("^check if the gmail page is launched and check if username is visible$")
	public void check_if_the_gmail_page_is_launched_and_check_if_username_is_visible() throws Throwable {
		
		driver.findElement(By.id("identifierId")).isDisplayed();
		
	}

	@When("^Enter username and click on yes$")
	public void enter_username_and_click_on_yes() throws Throwable {
		driver.findElement(By.id("identifierId")).sendKeys("desettiharish");
		driver.findElement(By.id("identifierNext")).click();
	}

	@Then("^check if the password field is displayed$")
	public void check_if_the_password_field_is_displayed() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("password")).isDisplayed();
	}

	@When("^enter password and click on yes$")
	public void enter_password_and_click_on_yes() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("d@harish123");
		driver.findElement(By.id("passwordNext")).click();
	}

	@Then("^check if the login is done$")
	public void check_if_the_login_is_done() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gbq1")));
		driver.quit();
	}
	
	
}
