Feature: Search Products

Scenario: Search multiple products
    Given User launches the eBay application
    When User searches multiple products
    Then Products should be searched
