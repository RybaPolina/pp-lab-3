import Geometry.Point;
import Geometry.ColoredCircle;

public class test {
    public static void main(String[] args) {
        Point center = new Point(1.0, 2.0);

        center.setX(3.0);
        center.setY(2.0);

        double radius = 10.0;
        String color = "Zielony";

        ColoredCircle colorcircle = new ColoredCircle(center, radius, color);
        
        System.out.println("Punkt środkowy: (" + colorcircle.getCenter().getX() + ", " + colorcircle.getCenter().getY() + ")");
        System.out.println("Promień: " + colorcircle.getRadius());
        System.out.println("Obwód: " + colorcircle.calculatePerimeter());
        System.out.println("Kolor:" +colorcircle.getColor());
    }

}
