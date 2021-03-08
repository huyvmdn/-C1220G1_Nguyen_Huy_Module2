package review_oop.oop_java_2.exercises2;

public class TapChi extends ThuVien {
    private int soPhathanh;
    private String thangPhatHanh;
    public TapChi(String maTaiLieu, String nhaXuatBan, int soLuongPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soLuongPhatHanh);
    }

    public TapChi(String maTaiLieu, String nhaXuatBan, int soLuongPhatHanh, int soPhathanh, String thangPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soLuongPhatHanh);
        this.soPhathanh = soPhathanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhathanh() {
        return soPhathanh;
    }

    public void setSoPhathanh(int soPhathanh) {
        this.soPhathanh = soPhathanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "maTaiLieu='" + this.getMaTaiLieu() + '\'' +
                ", nhaXuatBan='" + this.getNhaXuatBan() + '\'' +
                ", soLuongPhatHanh=" + this.getSoLuongPhatHanh() +
                "soPhathanh=" + soPhathanh +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
