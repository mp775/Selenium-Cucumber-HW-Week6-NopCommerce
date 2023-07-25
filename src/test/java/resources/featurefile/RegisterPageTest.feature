Feature: Register Page Test
  As user I want to verify the register page into nop commerce website

  @sanity
  Scenario: User Should Navigate To Register Page Successfully
    Given I am on homepage
    When I click on Register Link
    Then I should  Verify "Register" text

  @sanity
  Scenario: verify That First Name LastName Email Password And ConfirmPassword Fields Are Mandatory
    Given I am on homepage
    When I click on Register Link
    And I click on "REGISTER" button
    And I verify the error message for First Name field "First name is required."
    And I verify the error message for Last Name field "Last name is required."
    And I get the error message "Email is required."
    And I will get the error message "Password is required."
    And I Verify the error messages "Password is required."


  @sanity
  Scenario:Verify That User Should Create Account Successfully
    Given I am on homepage
    When I click on Register Link
    And I select gender "Male"
    And I enter firstname "Manav"
    And I enter lastname "Patel"
    And I select day "17"
    And I select month "January"
    And I select year "2000"
    And I enter email "manav.patel2000@gmail.com"
    And I enter password "Test123"
    And I enter Confirm Password "Test123"
    And I click on "REGISTER" button
    Then I should Verify message "Your registration completed"
