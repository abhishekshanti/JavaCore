package AbstractClass.Questions;

public class Rectangle extends Shape{


    int l,b;

    public Rectangle(String name,int l,int b){
        super(name);
        this.l=l;
        this.b=b;
    }

    public Double area(){
        return (double) (l*b);
    }

    public Double perimeter(){
        return (double) (2*l+2*b);
    }
}
