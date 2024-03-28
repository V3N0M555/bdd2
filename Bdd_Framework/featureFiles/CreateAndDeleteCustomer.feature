@createCustomer
Feature: Customer Module
Scenario Outline: Create and delete customer
Given Admin enters "http://localhost/login.do" in browser as url
When he enters "admin" and "manager" as un and pwd 
Then Enter time track page should be displayed
And he need to click on task tab
Then Task list page should be displayed
And he clicks on add new button
And he selects new customer option
Then he enters "<cusName>" as customer name
And description as "<desc>"
Then he selects an option from the dropdown
And click on create customer button
Then Customer should be created as "<cusName>"
And he clicks on settings button after searching customer name as "<cusName>"
Then he click on actions
And click on delete button
And delete permanently button
Then "<cusName>" should be deleted
And user should logout from the aplication
Examples:
|cusName|desc|
|rcb|escn|
|thor|avenger|
|thanos|destroyer|
