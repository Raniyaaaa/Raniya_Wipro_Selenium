Feature: eBay Login

  Scenario Outline: Login with valid credentials
    Given User launches the eBay application for login
    When User logs in with username <username> and password <password>
    Then Login should be successful

  Examples:
    | username               | password   |
    | raniya182002@gmail.com | Raniya@123 |
