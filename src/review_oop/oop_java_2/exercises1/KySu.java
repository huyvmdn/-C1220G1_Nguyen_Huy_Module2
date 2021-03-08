package review_oop.oop_java_2.exercises1;

public class KySu extends CanBo {
    private String nghanhDaoTao;

    public KySu(String hoten, String namSinh, String gioiTinh, String diaChi, String nghanhDaoTao) {
        super(hoten, namSinh, gioiTinh, diaChi);
        this.nghanhDaoTao = nghanhDaoTao;
    }

    public String getNghanhDaoTao() {
        return nghanhDaoTao;
    }

    public void setNghanhDaoTao(String nghanhDaoTao) {
        this.nghanhDaoTao = nghanhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "hoten='" + this.getHoten() + '\'' +
                ", namSinh='" + this.getNamSinh() + '\'' +
                ", gioiTinh='" + this.getGioiTinh() + '\'' +
                ", diaChi='" + this.getDiaChi() + '\'' +
                "nghanhDaoTao='" + this.getNghanhDaoTao() + '\'' +
                '}';
    }

    @Override
    public void ShowInfo() {
        System.out.println( "KySu{" +
                "hoten='" + this.getHoten() + '\'' +
                ", namSinh='" + this.getNamSinh() + '\'' +
                ", gioiTinh='" + this.getGioiTinh() + '\'' +
                ", diaChi='" + this.getDiaChi() + '\'' +
                "nghanhDaoTao='" + this.getNghanhDaoTao() + '\'' +
                '}');
    }
}
