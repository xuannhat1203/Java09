// Lớp Employees riêng biệt
class Employees {
    public int id;
    public String name;
    public String department;
    public double salary;
    public Employees(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void display() {
        System.out.println(id + " " + name + " " + department + " " + salary);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }
    public void increaseSalary(double percentage){
        this.salary += this.salary * percentage;
    }
}

public class Main {
    public static void main(String[] args) {
        Employees emp = new Employees(1, "John Doe", "IT", 5000.0);
        emp.display();
        emp.setSalary(6000.0);
        emp.display();
        emp.increaseSalary(50);
        emp.display();
    }
}
