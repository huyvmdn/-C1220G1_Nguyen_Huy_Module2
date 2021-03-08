package FuramaResort.Models;

public class Villa extends Services {
    private String standardRoom;
    private String otherFacilities;
    private double poolArea;
    private int noOfFloors;

    public Villa(String serviceId, String serviceName, double usableArea, double rentalCosts, int maxNoOfNumber, String rentalType, String standardRoom, String otherFacilities, double poolArea, int noOfFloors) {
        super(serviceId, serviceName, usableArea, rentalCosts, maxNoOfNumber, rentalType);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.poolArea = poolArea;
        this.noOfFloors = noOfFloors;
    }

    public Villa(String standardRoom, String otherFacilities, double poolArea, int noOfFloors) {
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.poolArea = poolArea;
        this.noOfFloors = noOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + ','
                + standardRoom + ','
                + otherFacilities + ','
                + poolArea + ','
                + noOfFloors ;
    }

    @Override
    public void showInfor() {
        System.out.println("service Id"+this.getServiceId()+ ','
                + "Service Name"+ this.getServiceName() + ','
                + "Usable Area"+ this.getUsableArea() + ','
                + "Rental Costs"+ this.getRentalCosts() + ','
                + "MaxNoOf Number"+ this.getMaxNoOfNumber() + ','
                + "Rental Type"+ this.getRentalType() + ','
                + "Standard Room"+ standardRoom + ','
                + "Other Facilities"+otherFacilities + ','
                + poolArea + ','
                + noOfFloors );
    }
    public static void main(String[] args) {
        Services service = new Villa("1", "Villa", 200, 1000, 5, "monthly", "Vip", "Pool", 200, 3);
        service.showInfor();
    }
}
