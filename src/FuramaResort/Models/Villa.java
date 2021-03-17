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

    public Villa(String[] arrString) {
        super(arrString);
        this.standardRoom = arrString[6];
        this.otherFacilities = arrString[7];
        this.poolArea = Double.parseDouble(arrString[8]);
        this.noOfFloors = Integer.parseInt(arrString[9]);
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
                + noOfFloors;
    }

    @Override
    public String showInfor() {
        System.out.println("Villa {serviceId='" + getServiceId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCost=" + getRentalCosts() +
                ", maxNoOfPeople=" + getMaxNoOfNumber() +
                ", rentalType='" + getRentalType() + '\'' +
                ", roomStandard='" + standardRoom + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", poolArea=" + poolArea +
                ", noOfFloors=" + noOfFloors + "}");

        return "Villa {serviceId='" + getServiceId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCost=" + getRentalCosts() +
                ", maxNoOfPeople=" + getMaxNoOfNumber() +
                ", rentalType='" + getRentalType() + '\'' +
                ", roomStandard='" + standardRoom + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", poolArea=" + poolArea +
                ", noOfFloors=" + noOfFloors + "}";
    }



    public static void main(String[] args) {
        Services service = new Villa("1", "Villa", 200, 1000, 5, "monthly", "Vip", "Pool", 200, 3);
        service.showInfor();
    }


}
