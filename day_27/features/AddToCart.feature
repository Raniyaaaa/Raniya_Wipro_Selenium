Feature: Add Product to Cart

  Scenario: Add a product to cart after login
    Given User is logged into eBay for adding
    When User adds a product to cart
    Then Product should be added to cart
