package Interface.Question1;

public class MovableCircle implements Movable{

    int r;
    MovablePoint movablePoint;

    public MovableCircle(int r,int x,int y,int xs,int ys,int t) {
        this.r = r;
        this.movablePoint = new MovablePoint(x,y,xs,ys,t);
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "r=" + r +
                ", movablePoint=" + movablePoint +
                '}';
    }
}
