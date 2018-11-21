import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefAccount {
    Account account;

    @Before
    public void init() {
        account = new Account();
    }

    @Given("my account balance have (\\d+) baht")
    public void my_account_balance_have(double money) {
        account = new Account(money);
    }

    @When("I add income (\\d+) to my account")
    public void i_add_income(double money) {
        account.income(money);
    }

    @When("I add expense (\\d+) to my account")
    public void i_add_expense(double money) {
        account.expense(money);
    }

    @Then("I can view my account balance is (.*)")
    public void balance_is(int money) {
        assertEquals(money, account.getMoney(money));
    }

    @When("^I add income -(\\d+) to my account$")
    public void i_add_income_to_my_account(double money) {
        account.income(money);
    }

    @When("^I add expense -(\\d+) to my account$")
    public void i_add_expense_to_my_account(double money) {
        account.expense(money);
    }

    @Given("my expense balance have (\\d+) baht")
    public void my_expense_balance_have(double money) {
        account = new Account(money);
    }

    @When("I add (\\d+) to my expense")
    public void i_add(double money) {
        account.getMoney(money);
    }

    @Then("I can view my expense balance is (.*) baht")
    public void i_can_view(int money) {
        assertEquals(money, account.getMoney(money));
    }

    @When("I save (\\d+) edit my expense")
    public void i_save(double money) {
        account.getMoney(money);
    }

    @Then("my expense balance change to (.*) baht")
    public void my_expense_balance_change_to(int money) {
        assertEquals(money, account.getMoney(money));
    }















}
