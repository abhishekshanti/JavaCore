package BankingSystem;

public class User {
    int accountNo;
    String name;
    private double balance;

    //user defined constructor
    public User(int accountNo,String name ,double balance){
        this.accountNo=accountNo;
        this.balance=balance;
        this.name=name;
    }

    //function to get balance
    public double getBalance() {
        return balance;
    }

    //function to withdraw money
    public void withdraw(int amt){
        if(amt<=balance){
            this.balance=this.balance -amt;
            System.out.println("Amount successfully withdrawn");
        }
        else{
            System.out.println("Not sufficient balance");
        }
    }

    //method for depositing
    public void deposit(int amt){
        this.balance=this.balance + amt;
    }


    //function for get account details
    public void getAccountDetails(){
        System.out.println("Name: "+ this.name);
        System.out.println("A/c no.: "+ this.accountNo);
        System.out.println("Balance: "+ this.balance);
    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
}
