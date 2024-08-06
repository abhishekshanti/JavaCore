import AbstractClass.A;
import AbstractClass.C;
import AbstractClass.Car;
import AbstractClass.Vehicle;

public class Main {
    public static void main(String[] args) {


//        C c1=new C();
//        A c2=new C();
//
//        c1.method1();
//        c2.method1();

        Vehicle v1=new Car(50);
        v1.displaySpeed();

    }
}