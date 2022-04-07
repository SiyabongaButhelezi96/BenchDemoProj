Feature: Feature to test ordering an Item functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And clicks login button
    Then user is navigated to the Home page

    And clicks the computers and Desktop link
    And selects to <sort>
    And user clicks Add to cart button
    Then user is navigated to specs page

    And user select type of <processor>
    And user selects <RAM>
    And user chooses HDD
    And user chooses OS
    And clicks and to cart button
    And then clicks the shopping cart link
    Then user is navigated to the shopping cart page

    And user specifies <quantity>
    And user clicks checkbox to accept terms and conditions
    And user clicks the checkout button
    Then user is navigated to the checkout page

    And user chooses billing address
    And user chooses shipping address
    And user chooses Shipping Method
    And user chooses payment method
    And user confirms payments information
    And user confirms the order
    Then order is completed





    Examples:
      | username | password | sort | processor | RAM | quantity |
      | buthelezisiyabonga96@gmail.com | SIyabonga19965@ | Price: Low to High | 1 | 1| 2 |


