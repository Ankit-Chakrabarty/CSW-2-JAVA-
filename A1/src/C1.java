/*Q1.create a bank-account app and perform basic operations like (withdraw) and (deposit).*/
class account {
    private double balance;
    public account(double balance) {
    balance = balance;}
    public void deposit(double amount) {
    if (amount > 0) {
    balance = balance +amount;
    System.out.println(amount + " deposited successfully.");} 
    else {
    System.out.println("Invalid amount for deposit.");}}
                                 public void withdraw(double amount) {
                                 if (amount > 0 && amount <= balance) {
                                 balance = balance -amount;
                                 System.out.println(amount + " withdrawn successfully.");}
        else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class C1 {
    public static void main(String[] args) {
        account acc = new account(1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(400);
    }
}



//output
//500.0 deposited successfully.
//200.0 withdrawn successfully.
//Insufficient funds or invalid amount for withdrawal.