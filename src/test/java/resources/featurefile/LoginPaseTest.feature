@smoke
Feature: Login Test
  As user I want to login into nop commerce website

  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should verify that "Welcome, Please Sign In!" message display

  Scenario: verify The ErrorMessage With InValidCredentials
    Given I am on homepage
    When I click on login link
    And I enter EmailId "abcd123@gmail.com"
    And I enter Password "xyz123"
    And I click on Login Button
    Then I should verify that the Error message

  Scenario: VerifyThatUserShouldLogOutSuccessFully()
    Given I am on homepage
    When I click on login link
    And I enter EmailId "primefivetest@yahoo.com"
    And I enter Password "abc123"
    And I click on Login Button
    And I click on LogOut Link
    Then I should verify that LogIn Link Display

