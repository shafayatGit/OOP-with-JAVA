package MidPrep;

// Base class
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        setBalance(balance); // use setter to validate
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    // Summary
    public String summary() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }

    // Method to be overridden
    public double calculateInterest(int months) {
        return 0.0;
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private double annualRate;

    public SavingsAccount(String accountNumber, double balance, double annualRate) {
        super(accountNumber, balance);
        this.annualRate = annualRate;
    }


    public double calculateInterest(int months) {
        return getBalance() * (Math.pow(1 + annualRate / 12, months) - 1);
    }


    public String summary() {
        return "SavingsAccount -> " + super.summary() + ", Annual Rate: " + annualRate;
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    private double monthlyFee;
    private double annualRate;

    public CurrentAccount(String accountNumber, double balance, double annualRate, double monthlyFee) {
        super(accountNumber, balance);
        this.annualRate = annualRate;
        this.monthlyFee = monthlyFee;
    }

    @Override
    public double calculateInterest(int months) {
        return getBalance() * (annualRate / 12) * months - monthlyFee * months;
    }

    @Override
    public String summary() {
        return "CurrentAccount -> " + super.summary() + ", Annual Rate: " + annualRate + ", Monthly Fee: " + monthlyFee;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // 1. Create accounts
        SavingsAccount savings = new SavingsAccount("S001", 5000, 0.04);
        CurrentAccount current = new CurrentAccount("C001", 10000, 0.01, 100);

        // 2. Test deposit/withdraw
        System.out.println("\n--- Deposit & Withdraw ---");
        savings.deposit(2000);
        savings.withdraw(1000);
        savings.withdraw(7000); // invalid (not enough balance)
        current.deposit(-500);   // invalid
        current.withdraw(2000);
//
        // 3. Compute 6-month interest and projected balance
        System.out.println("\n--- Interest Calculation (6 months) ---");
        double sInterest = savings.calculateInterest(6);
        System.out.println("Savings Interest (6 months): " + sInterest);
        System.out.println("Projected Balance: " + (savings.getBalance() + sInterest));

        double cInterest = current.calculateInterest(6);
        System.out.println("Current Interest (6 months): " + cInterest);
        System.out.println("Projected Balance: " + (current.getBalance() + cInterest));

        // 4. Polymorphism: store in array
        System.out.println("\n--- Polymorphism with BankAccount[] ---");
        BankAccount[] accounts = {savings, current};
        for (BankAccount acc : accounts) {
            System.out.println(acc.summary());
            System.out.println("6-Month Interest: " + acc.calculateInterest(6));
            System.out.println("-----------------------------");
        }
    }
}

