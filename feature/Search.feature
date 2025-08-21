Feature: check user can search

Scenario: successful search
Given Home page should be open in default browser
When click on search bar and the <item> and click enter
Then verify search functionality

	Examples:
	|item|
	|Online banking|