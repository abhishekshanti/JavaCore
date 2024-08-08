package Interface.Question;

public class Cleint {
    public static void main(String[] args) {
        Movable mp1=new MovablePoint(0,0,10,20,1);

        System.out.println(mp1);

        mp1.moveLeft();
        System.out.println(mp1);

        Movable circle1=new MovableCircle(5,7,10,10,20,2);

        circle1.moveRight();

        System.out.println(circle1);
    }


}
