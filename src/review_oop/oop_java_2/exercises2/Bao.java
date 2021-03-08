package review_oop.oop_java_2.exercises2;

public class Bao extends ThuVien {
    private String ngayPhatHanh;

    public Bao(String maTaiLieu, String nhaXuatBan, int soLuongPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soLuongPhatHanh);
    }

    public Bao(String maTaiLieu, String nhaXuatBan, int soLuongPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soLuongPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "maTaiLieu='" + this.getMaTaiLieu() + '\'' +
                ", nhaXuatBan='" + this.getNhaXuatBan() + '\'' +
                ", soLuongPhatHanh=" + this.getSoLuongPhatHanh() +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }
}
