package FuramaResort.Models;

public class Room extends Services {
    private String freeServicesIncluded;

    public Room(String serviceId, String serviceName, double usableArea, double rentalCosts, int maxNoOfNumber, String rentalType, String freeServicesIncluded) {
        super(serviceId, serviceName, usableArea, rentalCosts, maxNoOfNumber, rentalType);
        this.freeServicesIncluded = freeServicesIncluded;
    }

    public Room(String freeServicesIncluded) {
        this.freeServicesIncluded = freeServicesIncluded;
    }

    @Override
    public String toString() {
        return super.toString()+','+
                freeServicesIncluded ;
    }

    @Override
    public void showInfor() {
        System.out.println(super.toString() + ','
                + freeServicesIncluded);
    }
}
