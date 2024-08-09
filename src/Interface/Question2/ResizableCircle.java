package Interface.Question2;

public class ResizableCircle extends Circle  implements Resizable{


    public ResizableCircle(int radius) {
        super(radius);
    }

    @Override
    public void resize(int change) {
        radius+=radius*(change/100.0);
    }

    @Override
    public String toString() {
        return "ResizableCircle" + super.toString();
    }
}
