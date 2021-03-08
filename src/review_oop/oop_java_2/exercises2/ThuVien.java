package review_oop.oop_java_2.exercises2;

public abstract class ThuVien {
private String maTaiLieu;
private String nhaXuatBan;
private int soLuongPhatHanh;

    public ThuVien(String maTaiLieu, String nhaXuatBan, int soLuongPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuongPhatHanh = soLuongPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoLuongPhatHanh() {
        return soLuongPhatHanh;
    }

    public void setSoLuongPhatHanh(int soLuongPhatHanh) {
        this.soLuongPhatHanh = soLuongPhatHanh;
    }

    @Override
    public String toString() {
        return "ThuVien{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soLuongPhatHanh=" + soLuongPhatHanh +
                '}';
    }
}
