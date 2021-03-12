package Java9.Moveable;
public class MoveablePoint implements Moveable {
    private int x, y;

    public MoveablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MoveablePoint[" + x + ", " + y + "]";
    }

    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }
}