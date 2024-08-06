import AbstractClass.A;
import AbstractClass.C;
import AbstractClass.Car;
import AbstractClass.Vehicle;
import Package.Inside.InsideClass;
import Package.first;
import Package.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> l1=new ArrayList<>();

//        C c1=new C();
//        A c2=new C();
//
//        c1.method1();
//        c2.method1();

//        Vehicle v1=new Car(50);
//        v1.displaySpeed();
//        System.out.println("");

        //in order to instantiate the first class(in package Package) you need to import the package in the main class if it is not there
        first f1=new first();
        f1.print();

        B b1=new B();
        b1.print();

        InsideClass l2=new InsideClass();
        l2.print();


    }
}