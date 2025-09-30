class BankAccount {
    private int balance = 1000;

    // Synchronized withdrawal method
    public synchronized void withdraw(int amount, String person) {
        if (balance >= amount) {
            System.out.println(person + " is trying to withdraw " + amount);
            balance -= amount;
            System.out.println(person + " successfully withdrew " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println(person + " tried to withdraw " + amount + " but insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class WithdrawalThread extends Thread {
    private BankAccount account;
    private int amount;
    private String person;

    public WithdrawalThread(BankAccount account, int amount, String person) {
        this.account = account;
        this.amount = amount;
        this.person = person;
    }

    public void run() {
        account.withdraw(amount, person);
    }
}

public class Bank_Account_Withdrawal {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Without synchronization (for demonstration, comment out synchronized keyword in withdraw method)
        // With synchronization (as implemented)

        WithdrawalThread t1 = new WithdrawalThread(account, 700, "Person 1");
        WithdrawalThread t2 = new WithdrawalThread(account, 500, "Person 2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}