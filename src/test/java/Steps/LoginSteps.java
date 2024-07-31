package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\study\\java\\CucumberFramework\\src\\test\\resources\\driver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Given("User navigates to hackerrank website")
	public void user_navigates_hackerrank_website() {
		driver.get("https://www.hackerrank.com");
	
	}

	@Given("User clicks on the login button on homepage")
	public void user_clicks_on_the_login_button_on_homepage() {
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	}
	
	@Given("User clicks on the login for developer button")
	public void user_clicks_on_the_login_for_developer_button() {
		driver.findElement(By.xpath("(//a[contains(text(),'Login')])[2]")).click();
	}

	@Given("User enter a valid username")
	public void user_enter_a_valid_username() {
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("anubhavrajput193@gmail.com");
	}

	@Given("User enter a valid password")
	public void user_enter_a_valid_password() {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Anubhav@@7060");
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
	}

	@Then("User should be taken to the successful login page")
	public void user_should_be_taken_to_the_successful_login_page() throws InterruptedException {
		Thread.sleep(3000);
		WebElement bookmarkedChallengesButton=driver.findElement(By.xpath("//a[contains(text(),'Bookmarked Challenges')]"));
		Assert.assertEquals(true, bookmarkedChallengesButton.isDisplayed());
		driver.close();
	}
}
