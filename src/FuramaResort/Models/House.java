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
    }

}

