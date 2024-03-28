
Feature: Google search page
Scenario: Search for QSP basavangudi
Given User should enter "https://www.google.com" in browser
When User enters "Virat Kohli"
Then Search page should be displayed
