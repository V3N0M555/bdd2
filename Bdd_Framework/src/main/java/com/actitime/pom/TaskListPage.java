package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerBtn;
@FindBy(id="customerLightBox_nameField")
private WebElement customerNameTbx;
@FindBy(id="customerLightBox_descriptionField")
private WebElement customerDescTbx;
@FindBy(className ="x-btn-text")
private WebElement dropdownBtn;
@FindBy(linkText  ="Our Company")
private WebElement ourCompanyOpt;
@FindBy(xpath  ="//span[text()='Create Customer']")
private WebElement createCustomerBtn;
@FindBy(xpath="//div[contains(@class,'hasSelectedCustomer')]/div[1]/div[@class='title ellipsis']")
private WebElement createdCustomerHeader;
@FindBy(xpath="//input[@placeholder='Start typing name ...']")
private WebElement searchCusTbx;
@FindBy(xpath="//div[contains(@class,'edit_customer')]//div[text()='ACTIONS']")
private WebElement actionsBtn;
@FindBy(xpath = "//div[contains(@class,'edit_customer')]//div[text()='Delete']")
private WebElement deleteBtn;
@FindBy(id="customerPanel_deleteConfirm_submitTitle")
private WebElement deletePermanentlyBtn;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddNewBtn() {
	return addNewBtn;
}

public WebElement getNewCustomerBtn() {
	return newCustomerBtn;
}

public WebElement getCustomerNameTbx() {
	return customerNameTbx;
}

public WebElement getCustomerDescTbx() {
	return customerDescTbx;
}

public WebElement getDropdownBtn() {
	return dropdownBtn;
}

public WebElement getOurCompanyOpt() {
	return ourCompanyOpt;
}

public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
}

public WebElement getCreatedCustomerHeader() {
	return createdCustomerHeader;
}

public WebElement getSearchCusTbx() {
	return searchCusTbx;
}

public WebElement getActionsBtn() {
	return actionsBtn;
}

public WebElement getDeleteBtn() {
	return deleteBtn;
}

public WebElement getDeletePermanentlyBtn() {
	return deletePermanentlyBtn;
}

}
