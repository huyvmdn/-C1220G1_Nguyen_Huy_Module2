package FuramaResort.controllers;

import FuramaResort.commons.*;

import java.util.*;

public class MainController implements ReadAndWrite, Regex {
    public static Scanner scanner = new Scanner(System.in);
    static VillaController villaController = new VillaController();
    static HouseController houseController = new HouseController();
    static RoomController roomController = new RoomController();
    static CustomerController customerController = new CustomerController();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
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
                    showServices();
                    break;
                case "3":
                    customerController.addNewCustomer();
                    break;
                case "4":
                    customerController.showInformationCustomers();
                    break;
                case "5":
                    addNewBook();
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

    public static void addNewServices() {
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
                    villaController.addNewVilla(choice);
                    break;
                case "2":
                    houseController.addNewHouse(choice);
                    break;
                case "3":
                    roomController.addNewRoom(choice);
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


    public static void showServices() {
        while (true) {
            System.out.println("--SELECT FUNCTION--");
            System.out.println("1. Show all Villa.");
            System.out.println("2. Show all House.");
            System.out.println("3. Show all Room.");
            System.out.println("4. Show All Name Villa Not Duplicate.");
            System.out.println("5. Show All Name House Not Duplicate.");
            System.out.println("6. Show All Name Room Not Duplicate.");
            System.out.println("7. Back to menu");
            System.out.println("8. Exit.");
            System.out.println("SELECT FUNCTION: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    villaController.showAllVilla();
                    break;
                case "2":
                    houseController.showAllHouse();
                    break;
                case "3":
                    roomController.showAllRoom();
                    break;
                case "4":
                    villaController.showVillaUnduplicated();
                    break;
                case "5":
                    houseController.showAllHouseUnduplicated();
                    break;
                case "6":
                    roomController.showAllRoomUnduplicated();
                    break;
                case "7":
                    displayMainMenu();
                    break;
                case "8":
                    System.out.println("SEE YOU AGAIN");
                    System.exit(0);
                default:
                    System.out.println("SELECT FUNCTION AGAIN");
            }
        }
    }

    public static void addNewBook() {
        customerController.showInformationCustomers();
        String choiceCustomer = scanner.nextLine();

        while (true) {
            System.out.println("--SELECT FUNCTION--");
            System.out.println("1. Booking Villa\n");
            System.out.println("2. Booking House");
            System.out.println("3. Booking Room\n");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit.");
            System.out.println("SELECT FUNCTION: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    villaController.showAllVilla();
                    break;
                case "2":
                    houseController.showAllHouse();
                    break;
                case "3":
                    roomController.showAllRoom();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "5":
                    System.out.println("SEE YOU AGAIN");
                    System.exit(0);
                default:
                    System.out.println("SELECT FUNCTION AGAIN");
            }
        }
    }
}

