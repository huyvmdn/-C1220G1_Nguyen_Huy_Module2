package review_oop.oop_java_2.exercises1;

import _12_tree_map_collection.exercises.product_management.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    static Scanner scanner = new Scanner(System.in);
    static List<CanBo> danhSachCanBo = new ArrayList<>();

    public static void main(String[] args) {
        danhSachCanBo.add(new NhanVien("Nguyen A","12/12/1999","Nam","777/2 Trần Cao Vân","Kế toán"));
        danhSachCanBo.add(new KySu("Nguyen Thi B","22/2/1967","Nữ","72 Nam Cao","IT"));
        danhSachCanBo.add(new CongNhan("Tran Van C","22/6/1986","Nam","72 Nam Cao",4));
        displayMenu();
    }

    public static void displayMenu() {
        while (true) {
            System.out.print("\n--CHƯƠNG TRÌNH QUẢN LÝ CÁN BỘ--\n"
                    + "Chọn chức năng theo số (để tiếp tục):\n"
                    + "1. Nhập thông tin mới cho cán bộ\n"
                    + "2. Tìm kiếm theo họ tên\n"
                    + "3. Sắp xếp theo tên\n"
                    + "4. Hiển thị thông tin về danh sách các cán bộ\n"
                    + "5. Thoát khỏi chương trình.\n"
                    + "Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    add();
                    break;
                case "2":
                    search();
                    break;
                case "3":
                    sort();
                    break;
                case "4":
                    show();
                    break;
                case "5":
                    System.out.println("BYE ANH, chổ nào chưa tối ưu gốp ý giúp em. Thank a.");
                    System.exit(0);
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }

    public static void add() {
        while (true) {
            System.out.print("\n--CHỌN LOẠI CÁN BỘ CẦN THÊM--\n"
                    + "Chọn chức năng theo số (để tiếp tục):\n"
                    + "1. Nhân viên\n"
                    + "2. Kỹ sư\n"
                    + "3. Công nhân\n"
                    + "4. Về Trang chủ.\n"
                    + "Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addNhanVien();
                    break;
                case "2":
                    addKySu();
                    break;
                case "3":
                    addCongNhan();
                    break;
                case "4":
                    displayMenu();
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }

    public static void addNhanVien() {
        String hoten;
        String namSinh;
        String gioiTinh;
        String diaChi;
        String congViec;
        System.out.println("nhập Họ tên");
        hoten = scanner.nextLine();
        System.out.println("Năm sinh");
        namSinh = scanner.nextLine();
        System.out.println("Giới tính");
        gioiTinh = scanner.nextLine();
        System.out.println("Địa chỉ");
        diaChi = scanner.nextLine();
        System.out.println("Công việc");
        congViec = scanner.nextLine();
        CanBo canbo = new NhanVien(hoten, namSinh, gioiTinh, diaChi, congViec);
        danhSachCanBo.add(canbo);
    }

    public static void addCongNhan() {
        String hoten;
        String namSinh;
        String gioiTinh;
        String diaChi;
        int capBac;
        System.out.println("nhập Họ tên");
        hoten = scanner.nextLine();
        System.out.println("Năm sinh");
        namSinh = scanner.nextLine();
        System.out.println("Giới tính");
        gioiTinh = scanner.nextLine();
        System.out.println("Địa chỉ");
        diaChi = scanner.nextLine();
        System.out.println("Cấp bậc");
        capBac = Integer.parseInt(scanner.nextLine());
        CanBo canbo = new CongNhan(hoten, namSinh, gioiTinh, diaChi, capBac);
        danhSachCanBo.add(canbo);
    }

    public static void addKySu() {
        String hoten;
        String namSinh;
        String gioiTinh;
        String diaChi;
        String nghanhDaoTao;
        System.out.println("nhập Họ tên");
        hoten = scanner.nextLine();
        System.out.println("Năm sinh");
        namSinh = scanner.nextLine();
        System.out.println("Giới tính");
        gioiTinh = scanner.nextLine();
        System.out.println("Địa chỉ");
        diaChi = scanner.nextLine();
        System.out.println("Nghành đào tạo");
        nghanhDaoTao = scanner.nextLine();
        CanBo canbo = new KySu(hoten, namSinh, gioiTinh, diaChi, nghanhDaoTao);
        danhSachCanBo.add(canbo);
    }

    public static void search() {
        System.out.println("nhập tên");
        String nameSearch = scanner.nextLine();
        boolean check=false;
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoten().equals(nameSearch)) {
                System.out.println(canBo.toString());
                check=true;
            }
            }
        if(!check) {
            System.out.println("không có trong danh sách");
        }
    }
            public static void sort () {
                danhSachCanBo.sort(Comparator.comparing(CanBo::getHoten));
            }

            public static void show () {
                for (CanBo canBo : danhSachCanBo) {
                    System.out.println(canBo);
                }
            }
        }
