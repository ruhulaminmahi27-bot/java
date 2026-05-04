class Account {
    protected double balance;
    protected int rateOfInterest;
    Account(double balance, int rateOfInterest){
        this.balance = balance;
        this.rateOfInterest = rateOfInterest;
    }
    public double get_balance(){
        return balance;
    }
    public void addInterest(){
        balance = balance + (balance * rateOfInterest / 100.0);
    }
    public void get_details(){
        System.out.println("Balance: " + balance);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}
class Savings extends Account {
    private int rateOfInterest;
    Savings(double balance, int rateOfInterest){
        super(balance, rateOfInterest);
    }
    public void withdraw(double amount){
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    void deposit(double amount){
        balance = balance + amount;
    }
    public void addInterest() {
        super.addInterest();
    }
    public void get_details() {
        System.out.println(" Savings Account Details ");
        super.get_details();
    }
}
class Credit extends Account {
    private int rateOfInterest;
    private double amount;
    Credit(double balance, int rateOfInterest, double amount) {
        super(balance, rateOfInterest);
        this.amount = amount;
    }
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance + amount) {
            balance = balance - withdrawAmount;
        } else {
            System.out.println("Credit limit exceeded.");
        }
    }
    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }
    public void addInterest() {
        super.addInterest();
    }
    public void get_details() {
        System.out.println("Credit Account Details ");
        super.get_details();
        System.out.println("Credit Amount: " + amount);
    }
}
public class Bank{
    public static void main(String[] args) {
        Savings mySavings = new Savings(1000.0, 5);
        mySavings.deposit(500.0); 
        mySavings.withdraw(200.0); 
        mySavings.addInterest();  
        mySavings.get_details();
        Credit myCredit = new Credit(-200.0, 15, 5000.0);
        myCredit.deposit(1000.0);
        myCredit.withdraw(2000.0);
        myCredit.addInterest(); 
        myCredit.get_details();
    }
}