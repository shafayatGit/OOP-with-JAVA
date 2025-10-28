package Final;


// task1: Write the InsufficientFundsException class

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Withdrawal amount exceeds current balance.");
    }
}

 class Bank {
    private int balance;
    // Constructor
    public Bank(int initialBalance) {
        this.balance = initialBalance;
    }
    // task2: Write the withdraw method
     public void withdraw(int amount) throws InsufficientFundsException {
        if(amount > balance){
            throw new InsufficientFundsException();
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
 }

    // Main method to test the Bank class
    public class Final_251_1b {
        public static void main(String[] args) {
            Bank myAccount = new Bank(5000);
            try {
                myAccount.withdraw(6000);
            } catch (InsufficientFundsException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Transaction processing completed.");
            }
        }
}