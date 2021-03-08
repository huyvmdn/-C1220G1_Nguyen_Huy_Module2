package review_oop.oop_java_1.exercises1;

import java.util.Scanner;

public class Vehicle {
    private String tenXe;
    private double triGiaXe;
    private int dungTichXylanh;
    private double thueTruocBa;

    public Vehicle() {
    }

    public Vehicle(String tenXe, double triGiaXe, int dungTichXylanh) {
        this.tenXe = tenXe;
        this.triGiaXe = triGiaXe;
        this.dungTichXylanh = dungTichXylanh;
        if (dungTichXylanh<100 && dungTichXylanh>=0) {
            this.thueTruocBa=0.01*triGiaXe;
        }else if(dungTichXylanh>=100&& dungTichXylanh<=200){
            this.thueTruocBa=0.03*triGiaXe;
        }else if (dungTichXylanh>200) {
            this.thueTruocBa=0.05*triGiaXe;
        }else {
            System.err.println("Sai dữ liệu");
        }
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public double getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(double triGiaXe) {
        this.triGiaXe = triGiaXe;
    }

    public int getDungTichXylanh() {
        return dungTichXylanh;
    }

    public void setDungTichXylanh(int dungTichXylanh) {
        this.dungTichXylanh = dungTichXylanh;
    }

    public double getThueTruocBa() {
        return thueTruocBa;
    }

    public void setThueTruocBa(double thueTruocBa) {
        this.thueTruocBa = thueTruocBa;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tenXe='" + tenXe + '\'' +
                ", triGiaXe=" + triGiaXe +
                ", dungTichXylanh=" + dungTichXylanh +
                ", thueTruocBa=" + thueTruocBa +
                '}';
    }
    //    public int checkThueTruocBa() {
//
//            Scanner sc = new Scanner(System.in);
//            int n = 0;
//            boolean check = false;
//            while (!check) {
//                try {
//                    n = Integer.parseInt(sc.nextLine());
//                    if(n>0 ){
//                        check = true;
//                    } else  {
//                        System.err.println("Dung tich >0");
//                    }
//                } catch (Exception e) {
//                    System.err.println("wrong type data \n retype : ");
//                }
//            }
//            return n;
//    }
}
