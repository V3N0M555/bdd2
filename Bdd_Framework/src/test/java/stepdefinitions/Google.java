package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
	WebDriver driver;
	@Given("User should enter {string} in browser")
	public void user_should_enter_in_browser(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}@When("User enters {string}")
public void user_enters(String value) {
	driver.findElement(By.name("q")).sendKeys(value+Keys.ENTER);
}

	@Then("Search page should be displayed")
	public void search_page_should_be_displayed() {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		System.out.println(jse.executeScript("return document.title"));
	}


}
