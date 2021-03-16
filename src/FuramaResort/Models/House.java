package FuramaResort.Models;

public class House extends Services {
    private String standardRoom;
    private String otherFacilities;
    private int noOfFloors;

    public House(String serviceId, String serviceName, double usableArea, double rentalCosts, int maxNoOfNumber, String rentalType, String standardRoom, String otherFacilities, int noOfFloors) {
        super(serviceId, serviceName, usableArea, rentalCosts, maxNoOfNumber, rentalType);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.noOfFloors = noOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + ','
                + standardRoom + ','
                + otherFacilities + ','
                + noOfFloors;
    }

    @Override
    public String showInfor() {
        System.out.println("House{" +
                "serviceId='" + getServiceId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCost=" + getRentalCosts() +
                ", maxNoOfPeople=" + getMaxNoOfNumber() +
                ", rentalType='" + getRentalType() + '\'' +
                ", roomStandard='" + standardRoom + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", noOfFloors=" + noOfFloors +
                '}');

        return "House{" +
                "serviceId='" + getServiceId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCost=" + getRentalCosts() +
                ", maxNoOfPeople=" + getMaxNoOfNumber() +
                ", rentalType='" + getRentalType() + '\'' +
                ", roomStandard='" + standardRoom + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", noOfFloors=" + noOfFloors +
                '}';
    }

}

