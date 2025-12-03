// Example 3: Constructor Overloading — Bank Account
// Problem:

// Use overloaded constructors to:

// Create an account with default balance

// Create account with only account number

// Create account with account number + balance

public class BankAccount {
    int accNo;
    double balance;

    // Default
    BankAccount(){
        accNo = 0;
        balance  = 0.0;
    }
    // Account number only
    BankAccount(int accNo){
        this.accNo = accNo;
        balance = 0.0;
    }
    //Account number and blance
    BankAccount(int accNo, double balance){
        this.accNo = accNo;
        this.balance = balance;
    }
    void display(){
        System.out.println("Account No: " + accNo + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(12345);
        BankAccount b3 = new BankAccount(54321, 10000.500);
    
        b1.display();
        b2.display();
        b3.display();
    }

}
