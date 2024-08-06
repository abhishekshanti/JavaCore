package BankingSystem;

public class Client {
    public static void main(String[] args) {

        //creating Bank user u1 i.e object of class user
        User u1=new User(12345,"Abhishek",1000);

        u1.deposit(500);
        u1.withdraw(600);
        u1.getBalance();

        u1.getAccountDetails();
    }
}
