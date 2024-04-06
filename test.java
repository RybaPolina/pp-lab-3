import Geometry.Point;
import Geometry.Circle;
import Geometry.ColoredCircle;

public class test {
    public static void main(String[] args) {
      /* 
        Point center = new Point(1.0, 2.0);

        center.setX(3.0);
        center.setY(2.0);

        double radius = 10.0;
        String color = "Zielony";

        ColoredCircle colorcircle = new ColoredCircle(center, radius, color);
        
        System.out.println("Punkt środkowy: (" + colorcircle.getCenter().getX() + ", " + colorcircle.getCenter().getY() + ")");
        System.out.println("Promień: " + colorcircle.getRadius());
        System.out.println("Obwód: " + colorcircle.calculatePerimeter());
        System.out.println("Powierzchnia: " + colorcircle.calculateArea());
        System.out.println("Kolor:" + colorcircle.getColor());
        */  

        Circle[] kola = new Circle[4];
        kola[0] = new Circle(new Point(1.0, 1.0), 2.0);
        kola[1] = new Circle(new Point(2.0, 2.0), 3.0);
        kola[2] = new ColoredCircle(new Point(3.0, 3.0), 4.0, "Niebieski");
        kola[3] = new ColoredCircle(new Point(4.0, 4.0), 5.0, "Rozowy");

        for (Circle circle : kola) {
            System.out.println("Powierzchnia: " + circle.calculateArea());

            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor: " + coloredCircle.getColor());
            }
         }
    }
}
