package _12_tree_map_collection.exercises.product_management;

import java.util.*;

public class ProductManager {
    private static final Scanner scanner = new Scanner(System.in);
    //    private static ArrayList<Product> quanLySanPham = new ArrayList();
    private static final LinkedList<Product> quanLySanPham = new LinkedList<>();

    public static void main(String[] args) {
        quanLySanPham.add(new Product(1, 50, "iphone", "da nang"));
        quanLySanPham.add(new Product(2, 90, "sam sung", "da nang"));
        quanLySanPham.add(new Product(3, 40, "xiaomi", "da nang"));
        displayMenu();

    }

    public static void displayMenu() {
        while (true) {
            System.out.print("\n--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--\n"
                    + "Chọn chức năng theo số (để tiếp tục):\n"
                    + "1. Thêm mới\n"
                    + "2. Sửa thông tin sản phẩm theo Id\n"
                    + "3. Xóa sản phẩm theo Id\n"
                    + "4. Hiển thị danh sách sản phẩm\n"
                    + "5. Tìm kiếm sản phẩm theo tên\n"
                    + "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n"
                    + "7. Thoát\n"
                    + "Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    add();
                    break;
                case "2":
                    edit(quanLySanPham);
                    break;
                case "3":
                    delete(quanLySanPham);
                    break;
                case "4":
                    show(quanLySanPham);
                    break;
                case "5":
                    search(quanLySanPham);
                    break;
                case "6":
                    sort(quanLySanPham);
                    break;
                case "7":
                    System.out.println("GOODBYE ANH TRUNG");
                    System.exit(0);
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }

    public static void add() {
        int id;
        String name;
        int gia;
        String noiSanxuat;
        System.out.println("nhập Id");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        name = scanner.nextLine();
        System.out.println("nhập giá");
        gia = Integer.parseInt(scanner.nextLine());
        System.out.println("Nơi sản xuất");
        noiSanxuat = scanner.nextLine();
        Product sanPham = new Product(id, gia, name, noiSanxuat);
        quanLySanPham.add(sanPham);
    }

    public static void delete(LinkedList<Product> quanLySanPham) {
        System.out.println("nhập Id");
        int idXoa = Integer.parseInt(scanner.nextLine());
        quanLySanPham.removeIf(product -> product.getId() == idXoa);
    }

    public static void edit(LinkedList<Product> quanLySanPham) {
        System.out.println("nhập Id");
        int idSua = Integer.parseInt(scanner.nextLine());
        for (Product product : quanLySanPham) {
            if (product.getId() == idSua) {
                System.out.println("Sửa giá");
                int suaGia = Integer.parseInt(scanner.nextLine());
                product.setGia(suaGia);
                System.out.println("Sửa Id");
                int suaID = Integer.parseInt(scanner.nextLine());
                product.setId(suaID);
                System.out.println("Sửa tên");
                String suaTen = scanner.nextLine();
                product.setName(suaTen);
                System.out.println("Sửa nơi sản xuất");
                String suaNoiSanXuat = scanner.nextLine();
                product.setName(suaNoiSanXuat);
            }
        }
    }

    public static void show(LinkedList<Product> quanLySanPham) {
        System.out.println(quanLySanPham.toString());
    }

    public static void search(LinkedList<Product> quanLySanPham) {
        System.out.println("nhập tên");
        String nameSearch = scanner.nextLine();
        for (Product product : quanLySanPham) {
            if (product.getName().equals(nameSearch)) {
                System.out.println(product.toString());
            }
        }
    }

    public static void sort(LinkedList<Product> quanLySanPham) {
        while (true) {
            System.out.print("\n--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--\n"
                    + "Chọn chức năng theo số (để tiếp tục):\n"
                    + "1.Xếp tăng\n"
                    + "2. Xếp giảm\n"
                    + "3. Về menu\n"

                    + "Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    quanLySanPham.sort(Comparator.comparing(Product::getGia));
                    displayMenu();
                    break;
                case "2":
                    quanLySanPham.sort(Comparator.comparing(Product::getGia));
                    quanLySanPham.sort(Comparator.reverseOrder());
                    displayMenu();
                    break;
                case "3":
                    displayMenu();
                    break;
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }

    }
}

