package review_oop.oop_java_2.exercises1;

public class CongNhan extends CanBo {
    private int capBac;

    public CongNhan(String hoten, String namSinh, String gioiTinh, String diaChi, int capBac) {
        super(hoten, namSinh, gioiTinh, diaChi);
        this.capBac = capBac;
    }

    public int getCapBac() {
        return capBac;
    }

    public void setCapBac(byte capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "hoten='" + this.getHoten() + '\'' +
                ", namSinh='" + this.getNamSinh() + '\'' +
                ", gioiTinh='" + this.getGioiTinh() + '\'' +
                ", diaChi='" + this.getDiaChi() + '\'' +
                ", capBac='" + this.getCapBac() + '\'' +
                '}';
    }

    @Override
    public void ShowInfo() {
        System.out.println(
                "CongNhan{" +
                        "hoten='" + this.getHoten() + '\'' +
                        ", namSinh='" + this.getNamSinh() + '\'' +
                        ", gioiTinh='" + this.getGioiTinh() + '\'' +
                        ", diaChi='" + this.getDiaChi() + '\'' +
                        ", capBac='" + this.getCapBac() + '\'' +
                        '}'
        );
    }
}
