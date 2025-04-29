public class Inheritance {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box(box1);
        System.out.println("Box 1: " + box1.w + " " + box1.h + " " + box1.l);
        System.out.println("Box 2: " + box2.w + " " + box2.h + " " + box2.l);
    }
}
