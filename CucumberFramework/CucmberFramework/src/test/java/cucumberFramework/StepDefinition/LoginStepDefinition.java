package cucumberFramework.StepDefinition;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"E:\\Project\\Cucumber-Selenium-Framework\\CucumberFramework\\CucmberFramework\\src\\test\\java\\Resources\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
	}

	@Given("^the user access the login page from the webdriveruniversity home page$")
	public void the_user_access_the_login_page_from_the_webdriveruniversity_home_page() {
		driver.get("http://webdriveruniversity.com/");
		driver.findElement(By.xpath("//a[@id='login-portal']/div/div/h1")).click();
		Set<String> winId = driver.getWindowHandles();
		Iterator<String> it = winId.iterator();
/*		String homeId = it.next();
		String loginPageId = it.next();
		driver.switchTo().window(loginPageId); */
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
if(driver.getTitle().contains("Login Portal")){
	break;
}
}
	}

	@Given("^the user enters valid username$")
	public void the_user_enters_valid_username() {
		driver.findElement(By.id("text")).sendKeys("webdriver");
	}

	@Given("^the user enters valid pasword$")
	public void the_user_enters_valid_pasword() {
		driver.findElement(By.id("password")).sendKeys("webdriver123");
	}

	@When("^the user clicks on the login button$")
	public void the_user_clicks_on_the_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("^the user sees the alert for successful login$")
	public void the_user_sees_the_alert_for_successful_login() {
		Alert successAlert = driver.switchTo().alert();
		Assert.assertEquals(successAlert.getText(), "validation succeeded");
		successAlert.accept();
	}

	@Given("^the user enters invalid username$")
	public void the_user_enters_invalid_username() {
		driver.findElement(By.id("text")).sendKeys("webdriver");
	}

	@Given("^the user enters invalid pasword$")
	public void the_user_enters_invalid_pasword() {
		driver.findElement(By.id("text")).sendKeys("password123");

	}

	@Then("^the user sees the alert for unsuccessful login$")
	public void the_user_sees_the_alert_for_unsuccessful_login() {
		Alert failureAlert = driver.switchTo().alert();
		Assert.assertEquals(failureAlert.getText(), "validation failed");
		failureAlert.accept();
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
