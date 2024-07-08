package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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

	@Given("User navigates to stackoverflow website")
	public void user_navigates_to_stackoverflow_website() {
		driver.get("https://stackoverflow.com/");
	
	}

	@Given("User clicks on the login button on homepage")
	public void user_clicks_on_the_login_button_on_homepage() {
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
	}

	@Given("User enter a valid username")
	public void user_enter_a_valid_username() {
		System.out.println("user_navigates_to_stackoverflow_website");
	}

	@Given("User enter a valid password")
	public void user_enter_a_valid_password() {
		System.out.println("user_navigates_to_stackoverflow_website");
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		System.out.println("user_navigates_to_stackoverflow_website");
	}

	@Then("User should be taken to the successful login page")
	public void user_should_be_taken_to_the_successful_login_page() {
		System.out.println("user_navigates_to_stackoverflow_website");
	}
}
