Feature: Expense
    As a user
    I want to add and view my expense
    so that I know how much money I have

Scenario: Correct expense
    Given my account balance have 100 baht
    When I add expense 100 to my account
    Then I can view my account balance is 0 baht


Scenario: Incorrect expense
    Given my account balance have 100 baht
    When I add expense -100 to my account
    Then I can view my account balance is 100 baht



