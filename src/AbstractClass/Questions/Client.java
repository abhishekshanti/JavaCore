package AbstractClass.Questions;

public class Client {
    public static void main(String[] args) {

        Shape s1=new Circle("Circle",5) ;
        s1.display();

        Shape s2=new Rectangle("rectangle",5,10);
        s2.display();
    }
}
