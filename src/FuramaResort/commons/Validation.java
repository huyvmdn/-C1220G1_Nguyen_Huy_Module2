package FuramaResort.commons;

public class Validation implements Regex {
    public static boolean checkIdVilla(String serviceId) {
        boolean check = serviceId.matches(SERVICE_VILLA);
        if (!check) {
            System.err.println("Wrong Input");
        }
        return check;
    }

    public static boolean checkIdHouse(String serviceId) {
        boolean check = serviceId.matches(SERVICE_HOUSE);
        if (!check) {
            System.err.println("Wrong Input");
        }
        return check;
    }
    public static boolean checkIdRoom(String serviceId) {
        boolean check = serviceId.matches(SERVICE_ROOM);
        if (!check) {
            System.err.println("Wrong Input");
        }
        return check;
    }

    public static boolean checkServiceName(String serviceName) {
         boolean check = serviceName.matches(SERVICE_NAME);
        if (!check) {
            System.err.println("Wrong Input");
        }
        return check;
    }

    public  static boolean checkUsableArea(String usableArea) {
        try {
            double checkUsableArea = Double.parseDouble(usableArea);
            if (checkUsableArea >= 30) {
                return true;
            } else {
                System.err.println(" Wrong Input");
            }
        } catch (Exception e) {
            System.err.println(" Wrong Input");
        }
        return false;
    }
    public  static boolean checkRentalType(String rentalType) {
        boolean check = rentalType.matches(SERVICE_NAME);
        if (!check) {
            System.err.println("Wrong input");
        }
        return check;
    }
}
