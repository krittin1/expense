//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org..jupiter.api.Test;
public class Account {
    private double balance;
    private double money;
    private char choice;
    private  int date,month, year;
    private String category;
    private String description;
    private double totalIncome,totalExpense,total;

    public Account(double money) {
        balance = money;
    }

    public char getChoice() {
        return choice;
    }

    public int getDate() {
        return date;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public double getTotal() {
        total = this.totalIncome + this.totalExpense;
        return total;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
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
            this.totalIncome = this.totalIncome + money;
            return balance;
        }
        else{
            throw new IllegalArgumentException("Income must more than zero");
        }
    }

    public double expense(double money){
        if ( money > 0){
            this.balance = this.balance-money;
            this.totalExpense = this.totalExpense + money;
            return balance;
        }
        else{
            throw new IllegalArgumentException("expense must more than zero");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String edit(char choice, double money, int date,int month, int year, String category, String description ) {
        if ( choice == 'Y' || choice == 'y'  && ( category.equals("expense") || category.equals("income") )) {
            this.balance = money;
            return "Your balance is "+balance+"\nDate (update): "+date+"/"+month+"/"+year+"\ncategory: "+category+"\ndescription: "+description ;
        }
        else{
            return "Thank you.";
        }
    }



}

