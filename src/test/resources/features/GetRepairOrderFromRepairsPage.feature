@B29G18-219
Feature: As a POS & sales manager, I want to get repair order on the Repairs page

  Background: For all scenarios to be on login page
    Given I am on the login page


  Scenario: POS manager is able get repair order on Repairs Page
    And POS Manager is able login
    Then POS Manager clicks on repairs link on homepage
    Then user can select all the repair orders by clicking top checkbox

  @wip
    Scenario: Sales Manager is able to get repair order on Repairs page.
      And Sales Manger is able to login
      Then Sales Manger clicks on repairs link on homepage
      Then user can select all the repair orders by clicking top checkbox


