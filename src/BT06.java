class Point2D{
    double x, y;
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double distance(Point2D point) {
        return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    }
    public void displayPoint() {
        System.out.println("x: " + x + " y: " + y);
    }
}
public class BT06 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1.0, 1.0);
        System.out.println(p1.distance(new Point2D(1.0, 1.0)));
        Point2D p2 = new Point2D(5.0, 6.0);
        System.out.println(p2.distance(new Point2D(5.0, 6.0)));
        p2.displayPoint();
        p2.setX(6.6);
        p2.setY(5.5);
        p2.displayPoint();
    }
}
