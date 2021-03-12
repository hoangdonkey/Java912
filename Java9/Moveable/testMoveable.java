package Java9.Moveable;
public class testMoveable {
    public static void main(String[] args) {
        MoveablePoint p1 = new MoveablePoint(1, 2);

        System.out.println(p1);

        p1.moveRight();
        System.out.println(p1);

        p1.moveUp();
        System.out.println(p1);


        //test polymorphism
        Moveable p2 = new MoveablePoint(3, 4);
        p2.moveUp();
        System.out.println(p2);

        MoveablePoint p3 = (MoveablePoint)p2;
        System.out.println(p3);
    }
}