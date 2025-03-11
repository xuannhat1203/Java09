import java.util.Scanner;

class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
        this.radius = 1.0;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public void display(){
        System.out.println("Radius: " + radius + " Area: " + getArea());
    }
}
public class BT04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        circle.display();
        double radius = sc.nextDouble();
        Circle circle2 = new Circle(radius);
        circle2.display();
    }
}
