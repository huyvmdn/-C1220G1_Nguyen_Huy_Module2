package _17_IO_binary_file.exercises.produst_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdustManager implements Serializable {
    static Scanner scanner = new Scanner(System.in);
    static final String PATH = "C:\\Users\\Administrator\\Desktop\\Module 1\\C1220G1_Nguyen_Huy\\module_2\\C1220G2_NguyenHuy_Module2\\src\\_17_IO_binary_file\\exercises\\produst_manager\\luuThongTin.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        displayMenu();
    }

    static public void displayMenu() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.print("\n--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--\n"
                    + "Chọn chức năng theo số (để tiếp tục):\n"
                    + "1. Thêm mới sản phẩm\n"
                    + "2. Hiển thị sản phẩm\n"
                    + "3. Tìm kiếm thông tin sản phẩm\n"
                    + "4. Thoát\n"
                    + "Chọn chức năng: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    add();
                    break;
                case "2":
                    read();
                    break;
                case "3":
                    search();
                    break;
                case "4":
                    System.out.println("GOODBYE");
                    System.exit(0);
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }

    static public void add() throws IOException, ClassNotFoundException {
        int maSanPham;
        String tenSanPham;
        String hangSanxuat;
        int gia;
        String moTaKhac;

        System.out.println("Nhập mã sản phẩm");
        maSanPham = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        tenSanPham = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất");
        hangSanxuat = scanner.nextLine();
        System.out.println("Nhập giá ");
        gia = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả khác về sản phẩm");
        moTaKhac = scanner.nextLine();
        Product product = new Product(maSanPham, tenSanPham, hangSanxuat, gia, moTaKhac);
        write(product);
    }

    static public void write(Product product) throws IOException, ClassNotFoundException {
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
//        try {


//
//            fis.close();
//            ois.close();
////            Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
//            fos = new FileOutputStream(PATH);
//            oos = new ObjectOutputStream(fos);
//            //Khai báo mảng
//            sArr.add(product);
//
//            //Bước 2: Ghi mảng đối tượng vào file
//            oos.writeObject(sArr);
//
//        } catch (IOException ex) {
//            System.out.println("Loi ghi file: " + ex);
//        } finally {
//            fos.close();
//            oos.close();
//
//        }
        try {
            fis = new FileInputStream(PATH);
            ois = new ObjectInputStream(fis);
            List<Product> s = null;
            if ((new File(PATH).length() != 0)) {
                s = (List<Product>) ois.readObject();
            } else {
                s = new ArrayList<>();
            }
            fis.close();
            ois.close();

            FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Module 1\\C1220G1_Nguyen_Huy\\module_2\\C1220G2_NguyenHuy_Module2\\src\\_17_IO_binary_file\\exercises\\produst_manager\\luuThongTin.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            s.add(product);

            oos.writeObject(s);

            fos.close();
            oos.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    static public void read() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Module 1\\C1220G1_Nguyen_Huy\\module_2\\C1220G2_NguyenHuy_Module2\\src\\_17_IO_binary_file\\exercises\\produst_manager\\luuThongTin.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Product> sArr = (List<Product>) ois.readObject();
            for (Product products : sArr) {
                System.out.println(products.toString());
            }
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static private void search() {
        System.out.println("Nhập mã sản phẩm");
        int maSanPham = Integer.parseInt(scanner.nextLine());
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Module 1\\C1220G1_Nguyen_Huy\\module_2\\C1220G2_NguyenHuy_Module2\\src\\_17_IO_binary_file\\exercises\\produst_manager\\luuThongTin.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Product> sArr = (List<Product>) ois.readObject();
            for (Product products : sArr) {
                if (products.getMaSanPham() == maSanPham) {
                    System.out.println(products);
                }

                fis.close();
                ois.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

