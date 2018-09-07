import java.util.Scanner;
public class UI {
    public static void main(String[] args) {
        Account account = new Account();
        double a,food,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much your father give money to you? : ");
          a = sc.nextDouble();
        System.out.print("How much you pay for food? : ");
          food = sc.nextDouble();

        System.out.print("Your father give you ");
        System.out.println(account.income(a));
        System.out.print("buy food "+account.getMoney(food)+" baht your balance is ");
        System.out.println(account.expense(food));
        System.out.print("How much your mother give money to you? : ");
        a = sc.nextDouble();
        System.out.print("Your mother give you " +account.getMoney(a)+" baht balnce is "+account.income(a)+" baht");
        //System.out.println(account.income(50));
        //  System.out.println(account.getMoney);
        //Scanner sc = new Scanner(System.in);
        //  account.income()
    }
}
