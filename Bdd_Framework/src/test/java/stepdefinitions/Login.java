package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
@Given("User enters {string} in browser")
public void user_enters_in_browser(String url) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	}	@When("He enters {string} as username")
	public void he_enters_as_username(String un) {
	driver.findElement(By.id("username")).sendKeys(un);
	}	@And("He enters {string} as password")
	public void he_enters_as_password(String pwd) {
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}	@And("Clicks on login button")
	public void clicks_on_login_button() {
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.titleContains("Enter"));
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	System.out.println(jse.executeScript("return document.title"));
	}
}
