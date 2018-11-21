Feature: Income
    As a user
    I want to add and view my income
    so that I know how much money I have

Scenario: Correct income
    Given my account balance have 100 baht
    When I add income 100 to my account
    Then I can view my account balance is 200 baht

Scenario: Incorrect income
   Given my account balance have 100 baht
   When I add income -100 to my account
   Then I can view my account balance is 100 baht






