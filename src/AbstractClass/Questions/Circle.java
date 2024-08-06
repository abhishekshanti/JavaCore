package AbstractClass.Questions;

public class Circle extends Shape{

    int r=0;

    public Circle(String name,int r) {
        super(name);
        this.r=r;
    }

    public Double area(){
        return Math.PI*r*r;
    }

    public Double perimeter(){
        return 2*Math.PI*r;
    }

}
