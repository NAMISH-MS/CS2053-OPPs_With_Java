// 1. Bank Account Withdrawal 
// Create a BankAccount class with a balance of 1000.
// Start two threads representing two people trying to withdraw money. 
// Without synchronization, withdrawals may cause incorrect balances. 
// Use synchronized to make withdrawals safe.

class BankAccount{
    private int balance = 1000;

    public synchronized void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+ " Withdrew " + amount);
        }else{
            System.out.println(Thread.currentThread().getName()+ " Not enough balance to withdraw.");
        }
        System.out.println("Balance after withdrawal: " + balance);
    }

    public static void main(String[]args){
            BankAccount account =  new BankAccount();

            Thread t1 = new Thread (()-> {account.withdraw(700);});
            Thread t2 = new Thread (()-> {account.withdraw(500);});
            
            t1.start();
            t2.start();
    }
}