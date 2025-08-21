Feature: Change Language

  Scenario: Change site language
    Given User launches the eBay application language
    When User changes language <lang>
    Then Language should be changed
Examples:
|lang|
|Spain|