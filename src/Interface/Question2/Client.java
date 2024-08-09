package Interface.Question2;

public class Client {
    public static void main(String[] args) {
        ResizableCircle c1=new ResizableCircle(10);


        System.out.println("Radius: "+ c1.getRadius());
        System.out.println("Area: "+ c1.getArea());
        System.out.println("Perimeter: "+ c1.getPerimeter());

        c1.resize(50);

        System.out.println("Radius: "+ c1.getRadius());
        System.out.println("Area: "+ c1.getArea());
        System.out.println("Perimeter: "+ c1.getPerimeter());
    }



}
