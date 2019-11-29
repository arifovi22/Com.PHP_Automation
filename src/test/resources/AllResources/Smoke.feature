Feature: Php Travels

  Background: User in Home page
    Given user was the home page

  Scenario: Login Test
    When user put valid user name and passWord
    Then user able to land on his account page

  Scenario: validate User
    When user put valid user name and passWord
    Then user able to land on his account page and able see his name

  Scenario: Logout Test
    When user put valid user name and passWord
    Then user able to land on his account page and do logout

  Scenario: User can do register
    Given user on the website and click on registration
    Then User put all valid information and landed his account and validate his name
