package cucumberFramework.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	@Before()
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"E:\\Project\\Cucumber-Selenium-Framework\\CucumberFramework\\CucmberFramework\\src\\test\\java\\Resources\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
	}

	@Given("^the user is on the login page$")
	public void the_user_is_on_the_login_page() {
		driver.get("https://stackoverflow.com");
		driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();

	}

	@Given("^the user enters a valid username$")
	public void the_user_enters_a_valid_username() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("use-your-username");
	}

	@Given("^the user enters a valid password$")
	public void the_user_enters_a_valid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("use-your-password");
	}

	@When("^the user clicks on the login button$")
	public void the_user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//input[@id='submit-button']")).click();
	}

	@Then("^the user is redirected to the successful login page$")
	public void the_user_is_redirected_to_the_successful_login_page() throws Throwable {
		WebElement askAQuestionButton = driver.findElement(By.xpath("//a[contains(text(),'Ask Question')]"));
		Assert.assertEquals(true, askAQuestionButton.isDisplayed());
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
}
