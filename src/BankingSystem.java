
class BankAccount {
    int accountNo;
    double balance;
    final String bankName = "Dutch UIU Bank";
    static int totalAccounts = 0;

    public BankAccount() {
        accountNo = 0;
        balance = 0.0;
        totalAccounts++;
    }

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }

    }

    public void displayAccountInfo() {
        System.out.println("Account No: " + accountNo + " Balance: " + balance + "BankName: " + bankName);
    }

    static void displayTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

}


public class BankingSystem {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(101, 1200.00);
        b1.displayAccountInfo();
        BankAccount b2 = new BankAccount(202, 1100.00);
        b2.displayAccountInfo();
        BankAccount b3 = new BankAccount(303, 1000.00);
        b3.displayAccountInfo();
        BankAccount.displayTotalAccounts();

    }
}
