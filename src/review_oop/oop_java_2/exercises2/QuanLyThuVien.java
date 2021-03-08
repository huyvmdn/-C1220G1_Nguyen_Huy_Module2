package review_oop.oop_java_2.exercises2;

import review_oop.oop_java_2.exercises1.CanBo;
import review_oop.oop_java_2.exercises1.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyThuVien {
    static Scanner scanner = new Scanner(System.in);
    static List<ThuVien> danhSachThuVien = new ArrayList<>();
    static boolean check = false;

    public static void main(String[] args) {
        danhSachThuVien.add(new Sach("S01", "Kim Đồng", 768, "Dờ Bét", 200));
        danhSachThuVien.add(new Sach("S02", "Kim Đồng", 343, "Dờ Beo", 200));
        danhSachThuVien.add(new Sach("S03", "Kim Đồng", 593, "Nam Cao", 200));
        danhSachThuVien.add(new Bao("B15", "Kim Đồng", 593, "12/12/2020"));
        danhSachThuVien.add(new Bao("B13", "Kim Đồng", 45, "15/12/2020"));
        displayMenu();
    }

    public static void displayMenu() {
        while (true) {
            System.out.print("\n--CHƯƠNG TRÌNH QUẢN LÝ CÁN BỘ--\n"
                    + "Chọn chức năng theo số (để tiếp tục):\n"
                    + "1. Nhập thông tin về các tài liệu\n"
                    + "2. Hiển thị thông tin về các tài liệu\n"
                    + "3. Tìm kiếm tài liệu theo loại\n"
                    + "4. Thoát khỏi chương trình.\n"
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
                    search();
                    break;
                case "4":
                    System.out.println("GOOD BYE");
                    System.exit(0);
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }

    public static void add() {
        while (true) {
            System.out.print("\n--CHỌN LOẠI TÀI LIỆU CẦN THÊM--\n"
                    + "Chọn chức năng theo số (để tiếp tục):\n"
                    + "1. Sách\n"
                    + "2. Tạp chí\n"
                    + "3. Báo\n"
                    + "4. Về Trang chủ.\n"
                    + "Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addSach();
                    break;
                case "2":
                    addTapChi();
                    break;
                case "3":
                    addBao();
                    break;
                case "4":
                    displayMenu();
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }
    public static void addSach() {
        String maTaiLieu;
        String nhaXuatBan;
        int soLuongPhatHanh;
        String tenTacGia;
        int soTrang;
        System.out.println("Mã tài liệu");
        maTaiLieu = scanner.nextLine();
        System.out.println("Nhà xuất bản");
        nhaXuatBan = scanner.nextLine();
        System.out.println("Số lượng phát hành");
        soLuongPhatHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Tên tác giả");
        tenTacGia = scanner.nextLine();
        System.out.println("Công việc");
        soTrang = Integer.parseInt(scanner.nextLine());
        ThuVien sach = new Sach(maTaiLieu, nhaXuatBan, soLuongPhatHanh, tenTacGia, soTrang);
        danhSachThuVien.add(sach);
    }
    public static void addTapChi() {
        String maTaiLieu;
        String nhaXuatBan;
        int soLuongPhatHanh;
        String thangPhatHanh;
        int soPhathanh;
        System.out.println("Mã tài liệu");
        maTaiLieu = scanner.nextLine();
        System.out.println("Nhà xuất bản");
        nhaXuatBan = scanner.nextLine();
        System.out.println("Số lượng phát hành");
        soLuongPhatHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Số phát hành");
        soPhathanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Tháng phát hành");
        thangPhatHanh = scanner.nextLine();
        ThuVien tapChi = new TapChi(maTaiLieu, nhaXuatBan, soLuongPhatHanh, soPhathanh,thangPhatHanh );
        danhSachThuVien.add(tapChi);
    }
    public static void addBao() {
        String maTaiLieu;
        String nhaXuatBan;
        int soLuongPhatHanh;
        String ngayPhatHanh;

        System.out.println("Mã tài liệu");
        maTaiLieu = scanner.nextLine();
        System.out.println("Nhà xuất bản");
        nhaXuatBan = scanner.nextLine();
        System.out.println("Số lượng phát hành");
        soLuongPhatHanh = Integer.parseInt(scanner.nextLine());

        System.out.println("Ngày phát hành");
        ngayPhatHanh = scanner.nextLine();
        ThuVien bao = new Bao(maTaiLieu, nhaXuatBan, soLuongPhatHanh,ngayPhatHanh);
        danhSachThuVien.add(bao);
    }
    public static void search() {
        while (true) {
            System.out.print("\n--TÌM THEO LOẠI --\n"
                    + "Chọn chức năng theo số (để tiếp tục):\n"
                    + "1. Sách\n"
                    + "2. Tạp chí\n"
                    + "3. Báo\n"
                    + "4. Về trang chủ.\n"
                    + "Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    showSach();
                    break;
                case "2":
                    showTapChi();
                    break;
                case "3":
                    showBao();
                    break;
                case "4":
                    displayMenu();
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }

    public static void show() {
        for (ThuVien thuVien : danhSachThuVien) {
            System.out.println(thuVien);
        }
    }

    public static void showSach() {

        for (ThuVien sach : danhSachThuVien) {
            if (sach instanceof Sach) {
                System.out.println(sach);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không có trong thư viện");
        }
    }
        public static void showTapChi() {

            for (ThuVien tapChi : danhSachThuVien) {
                if (tapChi instanceof TapChi) {
                    System.out.println(tapChi);
                    check=true;
                }
            }
            if (!check) {
                System.out.println("Không có trong thư viện");
            }
    }
    public static void showBao() {

        for (ThuVien bao : danhSachThuVien) {
            if (bao instanceof Bao) {
                System.out.println(bao);
                check=true;
            }
        }
        if (!check) {
            System.out.println("Không có trong thư viện");
        }
    }
}
