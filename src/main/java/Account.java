//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org..jupiter.api.Test;
public class Account {
    private double balance;
    private double money;

    public Account(double money) {
        balance = money;
    }

    public Account(){
        this.balance = 0;
    }

    public double getMoney(double money) {
        this.money = this.money;
        return money;
    }

    public double income(double money){
        if (money > 0){
            this.balance = this.balance+money;
            return balance;
        }
        else{
            throw new IllegalArgumentException("Income must more than zero");
        }
    }

    public double expense(double money){
        if ( money > 0){
            this.balance = this.balance-money;
            return balance;
        }
        else{
            throw new IllegalArgumentException("expense must more than zero");
        }
    }

}

