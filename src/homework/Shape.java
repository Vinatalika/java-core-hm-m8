package homework;

public abstract class Shape {
    private static final String SHAPE = "shape";
    public abstract String getName();
    public static void printName() {
        System.out.println("Shape name: " + SHAPE);
    }
}
