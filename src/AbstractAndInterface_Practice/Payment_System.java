package AbstractAndInterface_Practice;

interface Payment{
    abstract String Pay(double amount);
}
class CreditCardPayment implements Payment{
    public String Pay(double amount){
        double total = amount + amount*0.02;
        return "Credit Card Fee:" + total;
    }
}
class PayPalPayment implements Payment {
    public String Pay(double amount) {
        double total = amount + (amount * 0.03) + 10;
        return "PayPal Fee:" + total;
    }
}
class CashPayment implements Payment {
    public String Pay(double amount) {
        //double total = amount + (amount * 0.03) + 10;
        return "Cash Fee:" + amount;
    }
}

public class Payment_System {
    public static void main(String[] args) {
    Payment Credit = new CreditCardPayment();
    Payment Paypal = new PayPalPayment();
    Payment Cash = new CashPayment();
    Payment [] fees = {Credit, Paypal, Cash};
    for(Payment p : fees){
        System.out.println(p.Pay(1000));
    }
    }
}
