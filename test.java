import Geometry.Point;
import Geometry.Circle;

public class test {
    public static void main(String[] args) {
        Point center = new Point(1.0, 2.0);

        center.setX(10.0);
        center.setY(-5.0);

        double radius = 10.0;
        Circle circle = new Circle(center, radius);
        
        System.out.println("Punkt środkowy: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień: " + circle.getRadius());
        System.out.println("Obwód: " + circle.calculatePerimeter());
    }

}
