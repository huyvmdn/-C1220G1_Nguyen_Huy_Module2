package _12_tree_map_collection.exercises.product_management;

public class Product implements Comparable<Product> {
    private int id;
    private int gia;
    private String name;
    private String noiSanxuat;

    public Product() {
    }

    public Product(int id, int gia, String name, String noiSanxuat) {
        this.id = id;
        this.gia = gia;
        this.name = name;
        this.noiSanxuat = noiSanxuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoiSanxuat() {
        return noiSanxuat;
    }

    public void setNoiSanxuat(String noiSanxuat) {
        this.noiSanxuat = noiSanxuat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", gia=" + gia +
                ", name='" + name + '\'' +
                ", noiSanxuat='" + noiSanxuat + '\'' +
                '}';
    }



    @Override
    public int compareTo(Product o) {
        return this.getGia()-(o.getGia());
    }
}
