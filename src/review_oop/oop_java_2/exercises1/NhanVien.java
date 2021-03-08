package review_oop.oop_java_2.exercises1;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String hoten, String namSinh, String gioiTinh, String diaChi, String congViec) {
        super(hoten, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "hoten='" + this.getHoten() + '\'' +
                ", namSinh='" + this.getNamSinh() + '\'' +
                ", gioiTinh='" + this.getGioiTinh() + '\'' +
                ", diaChi='" + this.getDiaChi() + '\'' +
                "congViec='" + this.congViec + '\'' +
                '}';
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void ShowInfo() {
        System.out.println(
                "NhanVien{" +
                        "hoten='" + this.getHoten() + '\'' +
                        ", namSinh='" + this.getNamSinh() + '\'' +
                        ", gioiTinh='" + this.getGioiTinh() + '\'' +
                        ", diaChi='" + this.getDiaChi() + '\'' +
                        "congViec='" + this.congViec + '\'' +
                        '}'
        );
    }
}
