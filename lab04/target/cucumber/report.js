$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/edit.feature");
formatter.feature({
  "line": 1,
  "name": "Edit",
  "description": "  As a user\r\n  I want to edit and view amount, date, category, description\r\n  so that I know how much money I have",
  "id": "edit",
  "keyword": "Feature"
});
formatter.before({
  "duration": 236980,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add to edit",
  "description": "",
  "id": "edit;add-to-edit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "my expense balance have 100 baht",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I add 500 to my expense",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I can view my expense balance is 500 baht",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 24
    }
  ],
  "location": "StepDefAccount.my_expense_balance_have(double)"
});
formatter.result({
  "duration": 560452740,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 6
    }
  ],
  "location": "StepDefAccount.i_add(double)"
});
formatter.result({
  "duration": 228241,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 33
    }
  ],
  "location": "StepDefAccount.i_can_view(int)"
});
formatter.result({
  "duration": 81493312,
  "status": "passed"
});
formatter.before({
  "duration": 56546,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Save edit",
  "description": "",
  "id": "edit;save-edit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "my expense balance have 500 baht",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I save 500 edit my expense",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "my expense balance change to 500 baht",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 24
    }
  ],
  "location": "StepDefAccount.my_expense_balance_have(double)"
});
formatter.result({
  "duration": 217959,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 7
    }
  ],
  "location": "StepDefAccount.i_save(double)"
});
formatter.result({
  "duration": 185060,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 29
    }
  ],
  "location": "StepDefAccount.my_expense_balance_change_to(int)"
});
formatter.result({
  "duration": 262682,
  "status": "passed"
});
});