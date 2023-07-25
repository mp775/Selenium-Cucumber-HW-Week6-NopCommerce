Feature: ComputerPageTest
  As user I want to verify the Computer page into nop commerce website

  @regression
  Scenario: User Should Navigate To Computer Page Successfully
    Given I am on homepage
    When I click on Computer tab
    Then I should Verify "Computers" text

  @regression
  Scenario:Use rShould Navigate To DesktopsPage Successfully
    Given I am on homepage
    When I mouse hover on Computer tab
    And I click on Desktops link
    Then I will verify "Desktops" text

  @regression
  Scenario: VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    Given I am on homepage
    When I mouse Hover on computer tabs
    And I click on Desktops links
    And I click on product name
    And I select following  details
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |

    And I select Software "software"
    And I click on "ADD TO CART" Button
    Then I verify message "The product has been added to your shopping cart"
