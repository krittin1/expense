Feature: Total
    As a user
    I want to add and view total income and expense (add all incomes minus all expenses)
    (optional: also view total income and total expense separately)
    So that I know how much total income and expense

Scenario:  Add to total
    Given  my total income balance have 100 baht
    When   I add for 100 to my total income
    Then   I can view my total income and expense balance is 200 baht


Scenario:   Save total income and expense
    Given   my total income and expense balance have 200 baht
    When    I save total income and expense 200
    Then    I can view my total income and expense balance is 200 baht
