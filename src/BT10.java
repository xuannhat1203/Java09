import java.util.ArrayList;
import java.util.Scanner;

class Student {
    public enum Gender {
        MALE, FEMALE, OTHER;
    }

    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public Student() {}

    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void inputData(Scanner sc) {
        System.out.print("Nhập mã HS: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập tên HS: ");
        name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập giới tính (MALE/FEMALE/OTHER): ");
        gender = Gender.valueOf(sc.next().toUpperCase());
        sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        phoneNumber = sc.nextLine();
    }

    public void displayData() {
        System.out.println("\nThông tin học sinh:");
        System.out.println("Mã HS: " + id);
        System.out.println("Tên HS: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
    }
}

public class BT10 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    public static void addStudent() {
        Student s = new Student();
        s.inputData(sc);
        students.add(s);
        System.out.println("Thêm thành công!");
    }

    public static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                students.get(i).displayData();
            }
        }
    }

    public static void editStudent() {
        System.out.print("Nhập mã sinh viên cần sửa: ");
        int id = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println("Nhập thông tin mới:");
                students.get(i).inputData(sc);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
    }

    public static void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã: " + id);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    displayAllStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    System.out.print("Nhập mã sinh viên muốn xóa: ");
                    int id = sc.nextInt();
                    deleteStudent(id);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
            }
        }
    }
}
