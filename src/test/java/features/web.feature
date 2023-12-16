Feature: Test Automation Web Sauce Lab

  @web
  Scenario: Login with valid username
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage


  @web
  Scenario: Login with invalid username
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "Invalid"
    When user click login button
    Then user able to see error message

  @web
  Scenario: Login, add cart and checkout
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user click Add to cart Back Pack
    And user click shopping cart
    And user click checkout
    And user input first name "Ad Maulana"
    And user input last name "Rahman"
    And user input postal code "73123"
    And user click continue
    When user click finish
    Then user is on last page