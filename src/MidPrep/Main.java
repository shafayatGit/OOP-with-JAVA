package MidPrep;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        //this.balance = balance;
        setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
            return;
        }
        System.out.println("Negative Bal");
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Negative Bal");
            return;
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            System.out.println("Withdraw successful");
            return;
        }
        System.out.println("Insufficient Bal");
    }

    double calculateInterest(int months) {
        return 0;
    }

//    public String summary(){
//
//    }
}

class SavingsAccount extends BankAccount {
    private double annualRate;

    public SavingsAccount(String accountNumber, double balance, double annualRate) {
        super(accountNumber, balance);
        this.annualRate = annualRate;
    }

    public double calculateInterest(int months) {
        return (getBalance() * (Math.pow(1 + annualRate / 12, months) - 1));
    }
}

class CurrentAccount extends BankAccount {
    private double monthlyFee;
    private double annualRate;

    public CurrentAccount(String accountNumber, double balance, double monthlyFee, double annualRate) {
        super(accountNumber, balance);
        this.monthlyFee = monthlyFee;
        this.annualRate = annualRate;
    }

    public double calculateInterest(int months){
        return getBalance() * (annualRate/12) * months - monthlyFee * months;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
