Feature: Edit
    As a user
    I want to edit and view amount, date, category, description
    so that I know how much money I have

Scenario: Add to edit
    Given my expense balance have 100 baht
    When I add 500 to my expense
    Then I can view my expense balance is 500 baht

Scenario: Save edit
    Given my expense balance have 500 baht
    When  I save 500 edit my expense
    Then  my expense balance change to 500 baht
