import java.util.Scanner;
import java.io.*;


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
        System.out.print("Your mother give you " +account.getMoney(a)+" baht balnce is "+account.income(a)+" baht\n");
        System.out.println("Your total income blance is "+account.getTotalIncome()+" baht.");
        System.out.println("Your total expense blance is "+account.getTotalExpense()+" baht.");
        System.out.println("Your total income-expense blance is "+account.getTotal()+" baht.");
        System.out.println();
        System.out.println();
        System.out.println("Do you want to edit account? :choose[Y] or [N] ");
        System.out.println("category must be income or expense");
        System.out.println(account.edit('Y',100,24,9,61,"expense","buy train ticket"));
        System.out.println(account.edit('y',150000,25,9,61,"income","salary"));
        System.out.println(account.edit('N',50000.75,26,9,61,"expense","buy phone"));





        String fileName = "temp.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                    new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);


            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }


    }


}


