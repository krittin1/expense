//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org..jupiter.api.Test;


public class Account {
    private double balance;
    private double money;
    //@Test
    public Account(double money) {
        balance = money;
    }
    //@Test
    public Account(){
        this.balance = 0;
    }
    //@Test
    public double getMoney(double money) {
        this.money = this.money;
        return money;
    }
    //@Test
    public double income(double money){
        if (money > 0){
            this.balance = this.balance+money;
            return balance;
        }
        else{
            throw new IllegalArgumentException("income must more than zero");
        }
    }
    //@Test
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