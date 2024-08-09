package Interface.Question2;

public class Circle{

    protected int radius;

    public Circle(int r){
        this.radius=r;
    }


    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius= (int) radius;
    }



    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
