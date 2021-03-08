package review_oop.oop_java_2.exercises2;

public class Sach extends ThuVien {
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String nhaXuatBan, int soLuongPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soLuongPhatHanh);
    }

    public Sach(String maTaiLieu, String nhaXuatBan, int soLuongPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, nhaXuatBan, soLuongPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maTaiLieu='" + this.getMaTaiLieu() + '\'' +
                ", nhaXuatBan='" + this.getNhaXuatBan() + '\'' +
                ", soLuongPhatHanh=" + this.getSoLuongPhatHanh() +
                "tenTacGia='" + this.getTenTacGia() + '\'' +
                ", soTrang=" + this.getSoTrang() +
                '}';
    }
}
