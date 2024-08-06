package AbstractClass;

abstract public class Vehicle {

    protected  int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    abstract void move();

    public void displaySpeed(){
        System.out.println("Currect speed is: "+speed);
    }
}

//Question:
// Make an abstract class "Vehicle"
// Having protected speed attribute
// Having abstract method move
// Having concrete method displaySpeed