class QuadraticEquation {
    public double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return Math.pow(b,2)- 4*a*c;
    }
    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }else {
            return Double.NaN;
        }
    }
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return Double.NaN;
        }
    }
    public void display() {
        double delta = getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có hai nghiệm thực:");
            System.out.println("x1 = " + getRoot1());
            System.out.println("x2 = " + getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + getRoot1());
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
    }
}
public class BT07 {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(6.0, 2.0, 3.0);
        quadraticEquation.display();
    }
}
