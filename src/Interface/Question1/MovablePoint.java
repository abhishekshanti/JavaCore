package Interface.Question1;

public class MovablePoint implements Movable{

    int x=0;
    int y=0;
    int xSpeed,ySpeed;
    int t;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed, int t) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.t = t;
    }

    @Override
    public void moveUp() {
        y+=ySpeed*t;
    }

    @Override
    public void moveDown() {
        y-=ySpeed*t;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed*t;
    }

    @Override
    public void moveRight() {
        x+=xSpeed*t;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", t=" + t +
                '}';
    }
}
