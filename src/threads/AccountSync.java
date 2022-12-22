package threads;
/**
 * Demonstrate resolution of a resource conflict with multiple threads
 * by using synchronized methods.
 *
 * @author Liang Ex 19.3
 * @author ben k steele
 */
class Account {
    private int balance = 0;     // current balance

    public int getBalance() {
        return balance;
    } // getBalance

    public synchronized void deposit(int amount) {
        int newBalance = balance + amount;
        // sleep was deliberately added to magnify data corruption problem.
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
        }
        balance = newBalance;
    } // deposit
}

public class AccountSync extends Thread {
    private final static int NUM_RUNNERS = 100;
    private static Thread thread[] = new Thread[NUM_RUNNERS];
    private Account account;

    public AccountSync(int i, Account account) {
        super(i + " Thread");
        this.account = account;
    }

    public static void main(String... args) {
        boolean done = false;

        Account account = new Account();

        // Create and launch NUM_RUNNERS threads that deposit 1 unit.
        for (int i = 0; i < NUM_RUNNERS; i++) {
            thread[i] = new AccountSync(i, account);
            thread[i].start();
        }

        // main calls join() on all the threads to wait for them all to finish.
        for (int i = 0; i < NUM_RUNNERS; i++) {
            try {
                thread[i].join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("balance == " + account.getBalance());
    }

    public void run() {
        account.deposit(1);
    }
}
