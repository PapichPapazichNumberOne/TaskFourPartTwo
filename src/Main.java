public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red", "Black");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue", "Green");
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Yellow", "Purple");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    public static void printShapeInfo(Shape shape) {
        System.out.println("Фигура: " + shape.getClass().getSimpleName());
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Цвет фона: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println();
    }
}