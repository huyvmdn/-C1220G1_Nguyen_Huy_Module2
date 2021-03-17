package FuramaResort.commons;

public class Validation implements Regex {
    public static boolean checkIdVilla(String serviceId) {
        boolean check = serviceId.matches(SERVICE_VILLA);
        if (!check) {
            System.err.println("Wrong Input");
        }
        return check;
    }

}
