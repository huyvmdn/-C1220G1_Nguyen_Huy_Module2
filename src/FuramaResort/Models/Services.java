package FuramaResort.Models;

public abstract class Services {
    private String serviceId;
    private String serviceName;
    private double usableArea;
    private double rentalCosts;
    private int maxNoOfNumber;
    private String rentalType;

    public Services(String serviceId, String serviceName, double usableArea, double rentalCosts, int maxNoOfNumber, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxNoOfNumber = maxNoOfNumber;
        this.rentalType = rentalType;
    }

    public Services() {
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNoOfNumber() {
        return maxNoOfNumber;
    }

    public void setMaxNoOfNumber(int maxNoOfNumber) {
        this.maxNoOfNumber = maxNoOfNumber;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return serviceId + ',' +
                serviceName + ',' +
                usableArea + ',' +
                rentalCosts + ',' +
                maxNoOfNumber + ',' +
                rentalType ;
    }

    public abstract void showInfor();
}
