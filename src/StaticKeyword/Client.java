package StaticKeyword;

public class Client {
    public static void main(String[] args) {

        StaticVariable s1=new StaticVariable();
        StaticVariable s2=new StaticVariable();
        StaticVariable s3=new StaticVariable();

        s1.print();
        s2.print();
        s3.print();

        s1.num=10;

        s1.print();
        s2.print();
        s3.print();

        StaticVariable.num=5;

        s1.print();
        s2.print();
        s3.print();



}



}
