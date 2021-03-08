package review_oop.oop_java_1.exercises1;

import review_oop.oop_java_2.exercises1.CanBo;
import review_oop.oop_java_2.exercises1.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Vehicle> vehicles= new ArrayList<>();
    public static void main(String[] args) {

        vehicles.add(new Vehicle("Wave @",12000000,110 ));
        vehicles.add(new Vehicle("SH",80000000,125 ));
        vehicles.add(new Vehicle("GPX 150cc Demon",62000000,150 ));
    mainMenu();
    }

    public static void mainMenu() {
        while (true) {
            System.out.print("\n--NHẬP XUẤT THÔNG TIN XE--\n"
                    + "Chọn chức năng theo số (để tiếp tục):\n"
                    + "1. Tạo các đối tượng xe và nhập thông tin\n"
                    + "2. Xuất bảng kê khai tiền thuế của các xe.\n"
                    + "3. Thoát\n"
                    + "Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    add();
                    break;
                case "2":
                    show();
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }
    public static void add() {
        String tenXe;
        int triGiaXe;
        int dungTichXylanh;
        System.out.println("nhập tên xe");
        tenXe = scanner.nextLine();
        System.out.println("trị giá xe");
        triGiaXe = Integer.parseInt(scanner.nextLine());
        System.out.println("Dung tích Xylanh");
        dungTichXylanh = Integer.parseInt(scanner.nextLine());


        Vehicle xe = new Vehicle(tenXe, triGiaXe, dungTichXylanh);
        vehicles.add(xe);
    }
    public static void show() {
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }
}
