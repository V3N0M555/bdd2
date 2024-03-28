@Login
Feature: Actitime login page
Scenario Outline: Login with valid and invalid credentials
Given admin enters "http://localhost/login.do" in browser
When admin enters "<username>" and "<password>"
And admin clicks on login button
Then Get the title and print it on the console
Examples:
|username|password|
|admin|manager|
|admin1|manager1|

