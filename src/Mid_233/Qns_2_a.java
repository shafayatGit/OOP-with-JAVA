package Mid_233;

class BankAccount {
    public String name;
    private String account_id;
    private double balance;

    BankAccount(String name, double balance,
                String gender) {
        this.name = name;
        this.balance = balance;
        this.account_id = gender + "-" + name;
    }

    public String getAccount_id() {
        return account_id;
    }

    BankAccount(String name, double balance) {
        this.name = name;
        setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        if (bal > 0) {
            this.balance = bal;
        }

    }
}

public class Qns_2_a {
    public static void main(String[] args) {
        BankAccount b = new
                BankAccount("Mr.Rahman", 1000);
        System.out.println("Account id:" + b.getAccount_id());
        System.out.println("balance before:" + b.getBalance());
        b.setBalance(b.getBalance() - 2000);
    }
}
