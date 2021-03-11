package FuramaResort.controllers;

import review_oop.oop_java_2.exercises1.CanBo;
import review_oop.oop_java_2.exercises1.NhanVien;

import java.util.List;
import java.util.Scanner;

public class MainController {
    public Scanner scanner = new Scanner(System.in);
    public void displayMainMenu() {
        while (true) {
            System.out.print("\n--SELECT FUNCTION--\n"
                    + "1. Add New Services\n"
                    + "2. Show Services\n"
                    + "3. Add New Customer\n"
                    + "4. Show Information of Customer\n"
                    + "5. Add New Booking\n"
                    + "6. Show Information of Employee\n"
                    + "7. Exit\n"
                    + "SELECT FUNCTION: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addNewServices();
                    break;
                case "2":
//                    showServices()
                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":
                    System.out.println("SEE YOU AGAIN");
                    System.exit(0);
                default:
                    System.out.println("SELECT FUNCTION AGAIN");
            }
        }
    }

    public void addNewServices() {
        while (true) {
            System.out.print("\n--SELECT FUNCTION--\n"
                    + "1. Add New Villa.\n"
                    + "2. Add New House.\n"
                    + "3. Add New Room.\n"
                    + "4. Back to menu.\n"
                    + "5. Exit.\n"
                    + "SELECT FUNCTION: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addNewVilla();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "5":
                    System.out.println("SEE YOU AGAIN");
                    System.exit(0);
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }

    public void addNewVilla() {
        String string = "";
        String serviceId;
        String serviceName;
        double usableArea;
        double rentalCost;
        int maxNoOfPeople;
        String rentalType;
        String roomStandard;
        String otherFacilities;
        double poolArea;
        int noOfFloors;

        System.out.println("service Id");
        serviceId = scanner.nextLine();
        System.out.println("service Name");
        serviceName = scanner.nextLine();
        System.out.println(" usable Area");
        usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("rental Cost");
        rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("max No Of People");
        maxNoOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("rental Type");
        rentalType = scanner.nextLine();
        System.out.println("roomStandard");
        roomStandard = scanner.nextLine();
        System.out.println("otherFacilities");
        otherFacilities = scanner.nextLine();
        System.out.println("pool Area");
        poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("no Of Floors");
        noOfFloors = Integer.parseInt(scanner.nextLine());
        string = serviceId + ',' + serviceName + ',' + usableArea + ',' + rentalCost + ',' + maxNoOfPeople + ',' + rentalType + ',' + roomStandard + ',' + otherFacilities + ',' + poolArea + ',' + noOfFloors;

    }
}

