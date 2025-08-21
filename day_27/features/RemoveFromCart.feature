Feature: Remove Product from Cart

  Scenario: Remove a product from cart after login
    Given User is logged into eBay for removing
    When User removes the product from cart
    Then Cart should be empty after removal
