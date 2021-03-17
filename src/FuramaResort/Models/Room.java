package FuramaResort.Models;

public class Room extends Services {
    private String freeServicesIncluded;

    public Room(String serviceId, String serviceName, double usableArea, double rentalCosts, int maxNoOfNumber, String rentalType, String freeServicesIncluded) {
        super(serviceId, serviceName, usableArea, rentalCosts, maxNoOfNumber, rentalType);
        this.freeServicesIncluded = freeServicesIncluded;
    }

    public Room(String[] arrString) {
        super(arrString);
        this.freeServicesIncluded = arrString[6];
    }

    @Override
    public String toString() {
        return super.toString() + ',' +
                freeServicesIncluded;
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
                ", freeServicesIncluded='" + freeServicesIncluded + '\'' +
                '}');

        return "House{" +
                "serviceId='" + getServiceId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCost=" + getRentalCosts() +
                ", maxNoOfPeople=" + getMaxNoOfNumber() +
                ", rentalType='" + getRentalType() + '\'' +
                ", freeServicesIncluded='" + freeServicesIncluded + '\'' +
                '}';
    }
}
