package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeLogin {
	WebDriver driver;
	@Given("admin enters {string} in browser")
	public void admin_enters_in_browser(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	}

	@When("admin enters {string} and {string}")
	public void admin_enters_and(String un, String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

	@And("admin clicks on login button")
	public void admin_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	@Then("Get the title and print it on the console")
	public void get_the_title_and_print_it_on_the_console() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}



}
