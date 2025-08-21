Feature: Validate login
Scenario Outline: Check for valid and invalid credentials 
Given login page should be open in default browser
When click on login button and enter <username1> and <password1>
Then login successfully and open home page
Examples:
|username1|password1|
|87392164|password|
|username|bdsfb8|
|bcjs74896hf|jdkfs783|
|username|password|