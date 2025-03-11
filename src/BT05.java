import java.util.Scanner;

class Vector2D {
    double x, y;
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double calculateMagnitude(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public double add(Vector2D v) {
        return x + v.x;
    }
    public double subtract(Vector2D v) {
        return x - v.x;
    }
    public double dotProduct(Vector2D v) {
        return x * v.x;
    }
    public void displayVector(Vector2D v){
        System.out.println("x: " + x + " y: " + y);
        System.out.println("Magnitude: " + calculateMagnitude());
        System.out.println("Add: "+add(v));
        System.out.println("Subtract: "+subtract(v));
        System.out.println("DotProduct: "+dotProduct(v));
    }
}
public class BT05 {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1.0, 1.0);
        Vector2D v3 = new Vector2D(5, 6);
        v1.displayVector(v3);
        Vector2D v2 = new Vector2D(2.0, 2.0);
        Vector2D v4 = new Vector2D(1, 2);
        v2.displayVector(v4);
    }
}
