package FuramaResort.Models;

public class House extends Services {
    private String standardRoom;
    private String otherFacilities;
    private int noOfFloors;

    @Override
    public String toString() {
        return super.toString()+ ','
                + standardRoom + ','
                + otherFacilities + ','
                + noOfFloors;
    }

    @Override
    public void showInfor() {
        System.out.println(super.toString() + ','
                + standardRoom + ','
                + otherFacilities + ','
                + noOfFloors );
    }

}

