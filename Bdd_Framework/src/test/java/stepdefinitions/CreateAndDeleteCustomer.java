package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAndDeleteCustomer
{
	WebDriver driver=BaseClass.driver;
	TaskListPage t=new TaskListPage(driver);
	@Given("Admin enters {string} in browser as url")
	public void admin_enters_in_browser_as_url(String url) {
		driver.get(url);
	}

	@When("he enters {string} and {string} as un and pwd")
	public void he_enters_and_as_un_and_pwd(String un, String pwd) {
	LoginPage l=new LoginPage(driver);
	l.login(un, pwd);
	}

	@Then("Enter time track page should be displayed")
	public void enter_time_track_page_should_be_displayed() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println(driver.getTitle());
	}
	@And("he need to click on task tab")
	public void he_need_to_click_on_task_tab() {
		HomePage h=new HomePage(driver);
		h.getTaskTab().click();
	}

	@Then("Task list page should be displayed")
	public void task_list_page_should_be_displayed() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("Task"));
		System.out.println(driver.getTitle());
	}

	@And("he clicks on add new button")
	public void he_clicks_on_add_new_button() {
		t.getAddNewBtn().click();
	}

	@And("he selects new customer option")
	public void he_selects_new_customer_option() {
		t.getNewCustomerBtn().click();
	}

	@Then("he enters {string} as customer name")
	public void he_enters_as_customer_name(String customerName) {
		t.getCustomerNameTbx().sendKeys(customerName);
	}

	@And("description as {string}")
	public void description_as(String desc) {
		t.getCustomerDescTbx().sendKeys(desc);
	}

	@Then("he selects an option from the dropdown")
	public void he_selects_an_option_from_the_dropdown() {
		t.getDropdownBtn().click();
		t.getOurCompanyOpt().click();
	}

	@And("click on create customer button")
	public void click_on_create_customer_button() {
		t.getCreateCustomerBtn().click();
	}
@Then("Customer should be created as {string}")
public void customer_should_be_created_as(String expText) throws InterruptedException {
	Thread.sleep(1000);
	String actualText = t.getCreatedCustomerHeader().getText();
	Assert.assertEquals(actualText, expText);
	System.out.println(expText+" is created");
}
@Then("he clicks on settings button after searching customer name as {string}")
public void he_clicks_on_settings_button_after_searching_customer_name_as(String cusName) throws InterruptedException {
	Thread.sleep(1000);
	t.getSearchCusTbx().sendKeys(cusName);
	driver.findElement(By.xpath("//span[text()='"+cusName+"']/../..//div[@class='editButton available']")).click();
}

	@Then("he click on actions")
	public void he_click_on_actions() throws InterruptedException {
		Thread.sleep(1000);
	t.getActionsBtn().click();
	}

	@And("click on delete button")
	public void click_on_delete_button() {
	t.getDeleteBtn().click();
	}
	@And("delete permanently button")
	public void delete_permanently_button() {
		t.getDeletePermanentlyBtn().click();
	}
	@Then("{string} should be deleted")
	public void should_be_deleted(String cusName) {
		System.out.println(cusName+" is deleted");
	}

	@And("user should logout from the aplication")
	public void user_should_logout_from_the_aplication() throws InterruptedException {
		Thread.sleep(1000);
		HomePage h=new HomePage(driver);
		h.logout();
	}
}
