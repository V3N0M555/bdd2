package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(id="logoutLink")
private WebElement logoutBtn;
@FindBy(linkText = "TASKS")
private WebElement taskTab;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void logout() {
	logoutBtn.click();
}
public WebElement getTaskTab() {
	return taskTab;
}
}
