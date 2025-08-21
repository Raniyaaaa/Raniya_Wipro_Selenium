Feature: Change Current Address in eBay Account

  Scenario: Login and change the current address
    Given User is logged into eBay for addresschange
    When User changes the current address
    Then Address should be updated successfully
