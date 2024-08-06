package BankingSystem.FinalKeyword;

public class Client {
    public static void main(String[] args) {
        A a1=new A();
        a1.draw();

        B b1=new B();
        b1.draw();
        b1.b=4;
        System.out.println(a1.b);

        System.out.println(b1.b);
        System.out.println(b1.a);

    }
}
