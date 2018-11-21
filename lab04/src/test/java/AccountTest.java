import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {


    @Test
    public void getMoney() {
        double  t1  = 100.50;
        Account account = new Account(t1);
        assertEquals(account.getMoney(t1),100.50,0.00001 );
    }

    @Test
    public void income() {
        double t2 = 100;
        Account account = new Account(t2);
        assertEquals(account.income(t2),200.00,0.00001);
    }

    @Test
    public void expense() {
        double t3 = 100;
        Account account = new Account(t3);
        assertEquals(account.expense(t3),0.00,0.00001);
    }


}