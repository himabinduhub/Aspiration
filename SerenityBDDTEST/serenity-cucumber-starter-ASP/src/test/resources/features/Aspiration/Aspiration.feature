Feature: Aspiration Products

  Scenario Outline: User can view aspiration products and prices
    Given user is on aspiration home page
    When user clicks on Spend and Save link on home page
    And user can see aspiration products
    And user clicks on get aspiration and can see sign up with email
    And user clicks on get aspiration plus and can see price plans
    Then "<Price_Yr>" as "<PlanB>" and "<Price_Mon>" as "<PlanA>" price options are displayed

    Examples: 
      | PlanA   | PlanB  | Price_Mon          | Price_Yr                |
      | Monthly | Yearly | $7.99 paid monthly | $71.88 paid once yearly |
