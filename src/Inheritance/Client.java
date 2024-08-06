package Inheritance;

public class Client {
    public static void main(String[] args) {
        Cat c1= new Cat();
        Dog d1=new Dog();

        d1.makeSound();
        c1.makeSound();

        Car car= new Car();

        car.make="mahindra";              //parent class attributes
        car.model=2023;                   //parent class attributes
        car.noOfDoors=5;                  //child class attributes

        System.out.println("make: "+ car.make);
        System.out.println("model: "+ car.model);
        System.out.println("noOfDoors: "+ car.noOfDoors);
    }

    Drawing d1=new Drawing();
    Circle c1=new Circle(5);
    Square s1=new Square(4);



    
}

