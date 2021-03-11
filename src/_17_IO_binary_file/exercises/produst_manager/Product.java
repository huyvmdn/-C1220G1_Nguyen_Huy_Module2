package _17_IO_binary_file.exercises.produst_manager;

import java.io.Serializable;

public class Product implements Serializable {
    private int maSanPham;
    private String tenSanPham;
    private String hangSanxuat;
    private int gia;
    private String moTaKhac;

    public Product(int maSanPham, String tenSanPham, String hangSanxuat, int gia, String moTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanxuat = hangSanxuat;
        this.gia = gia;
        this.moTaKhac = moTaKhac;
    }

    public Product() {
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanxuat() {
        return hangSanxuat;
    }

    public void setHangSanxuat(String hangSanxuat) {
        this.hangSanxuat = hangSanxuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTaKhac() {
        return moTaKhac;
    }

    public void setMoTaKhac(String moTaKhac) {
        this.moTaKhac = moTaKhac;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanxuat='" + hangSanxuat + '\'' +
                ", gia=" + gia +
                ", moTaKhac='" + moTaKhac + '\'' +
                '}';
    }
}

