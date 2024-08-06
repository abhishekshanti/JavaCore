package AbstractClass.Questions;

public abstract class Shape {

    protected String name;

    public Shape(String name){
        this.name=name;
    }

    abstract public Double area();
    abstract public Double perimeter();

    public void display(){
        System.out.println("Area is :"+  this.area());
        System.out.println("Perimeter is :"+ this.perimeter());
    }
}
