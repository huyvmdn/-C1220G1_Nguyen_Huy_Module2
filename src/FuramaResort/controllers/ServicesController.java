package FuramaResort.controllers;

import FuramaResort.commons.Regex;
import FuramaResort.commons.Validation;

import java.util.Scanner;

public class ServicesController<E> implements Regex {

    public Scanner scanner = new Scanner(System.in);
    String serviceId;
    String serviceName;
    double usableArea = 0;
    double rentalCost = 0;
    int maxNoOfPeople = 0;
    String rentalType;

    boolean check = false;

    public String addSeviceID(String choice) {
        do {
            if (choice.equals("1")) {
                
                System.out.println("service Id(Villa) (SVVL-1234)");
                serviceId = scanner.nextLine();
                check = Validation.checkIdVilla(serviceId);

            } else if (choice.equals("2")) {

                System.out.println("service Id(House) (SVHO-1234)");
                serviceId = scanner.nextLine();
                check = serviceId.matches(SERVICE_HOUSE);
                if (!check) {
                    System.err.println("Wrong Input");
                }

            } else if (choice.equals("3")) {
                System.out.println("service Id(Room) (SVRO-1234)");
                serviceId = scanner.nextLine();
                check = serviceId.matches(SERVICE_ROOM);
                if (!check) {
                    System.err.println("Wrong Input");
                }
            }
        } while (!check);
        return serviceId;
    }

    public String addSeviceName() {
        check = false;
        do {
            System.out.println("service Name ( Abc...)");
            serviceName = scanner.nextLine();
            check = serviceName.matches(SERVICE_NAME);
            if (!check) {
                System.err.println("Wrong Input");
            }
        } while (!check);
        return serviceName;
    }

    public Double addUsableArea() {
        check = false;
        do {
            try {
                System.out.println(" usable Area (Number >=30m2): ");
                usableArea = Double.parseDouble(scanner.nextLine());
                if (usableArea >= 30) {
                    check = true;
                    break;
                } else {
                    System.err.println(" Wrong Input");
                }
            } catch (Exception e) {
                System.err.println(" Wrong Input");
            }
        } while (!check);
        return usableArea;
    }

    public Double addRentalCost() {
        check = false;
        do {
            try {
                System.out.println("rental Cost (Number>0)");
                rentalCost = Double.parseDouble(scanner.nextLine());
                if (rentalCost > 0) {
                    check = true;
                    break;
                } else {
                    System.err.println(" Wrong Input");
                }
            } catch (Exception e) {
                System.err.println(" Wrong Input");
            }
        } while (!check);
        return rentalCost;
    }

    public int addMaxNoOfPeople() {
        check = false;
        do {
            try {
                System.out.println("max No Of People (0<Number<20): ");
                maxNoOfPeople = Integer.parseInt(scanner.nextLine());
                if (maxNoOfPeople > 0 && maxNoOfPeople < 20) {
                    check = true;
                    break;
                } else {
                    System.err.println(" Wrong Input");
                }
            } catch (Exception e) {
                System.err.println(" Wrong Input");
            }
        } while (!check);
        return maxNoOfPeople;
    }

    public String addRentalType() {
        check = false;
        do {
            System.out.println("rental Type (Abc...)");
            rentalType = scanner.nextLine();
            check = rentalType.matches(SERVICE_NAME);
            if (!check) {
                System.err.println("Wrong input");
            }
        } while (!check);
        return rentalType;
    }
}
