@Login @Valid
Feature: Actitime login page
Scenario: Enter valid credentials and check home page is displayed

Given User enters "http://localhost/login.do" in browser
When He enters "admin" as username 
And He enters "manager" as password 
And Clicks on login button
Then Home page should be displayed
