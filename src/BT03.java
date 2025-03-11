class Rectangle {
    public double width;
    public double length ;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(){
        this.width = 1;
        this.length = 1;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return (length + width) * 2;
    }
    public void display(){
        System.out.println("Dientich: " + getArea());
        System.out.println("Chuvi: "+getPerimeter());
    }
}
public class BT03 {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(1.2, 2.3);
        rc.display();
        Rectangle df = new Rectangle();
        df.display();
    }
}
