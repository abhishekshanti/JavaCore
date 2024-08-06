package AbstractClass;

public class Car extends Vehicle{

    public Car(int speed) {
        super(speed);
    }

    @Override
    void move() {
        System.out.println("Car is moving");
    }
}
