package FuramaResort.controllers;

import FuramaResort.Models.Customer;
import FuramaResort.commons.*;

import java.util.*;

public  class MainController implements ReadAndWrite, Regex {
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
                    + "7. Manage Cinema Service\n"
                    + "8. Manage Filing Cabinets\n"
                    + "9. Exit\n"
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
                    EmployeeController.showAllEmployee();
                    break;
                case "7":
                    manageCinemaService();
                    break;
                case "8":
                    manageFilingCabinets();
                    break;
                case "9":
                    System.out.println("SEE YOU AGAIN");
                    System.exit(0);
                default:
                    System.err.println("SELECT FUNCTION AGAIN");
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
                    System.err.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
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
                    System.err.println("SELECT FUNCTION AGAIN");
            }
        }
    }

    public static void addNewBook() {
        customerController.showInformationCustomers();
        Customer choiceCustomer = BookingController.choiceCustomer();
        while (true) {
            System.out.println("--SELECT FUNCTION--");
            System.out.println("1. Booking Villa");
            System.out.println("2. Booking House");
            System.out.println("3. Booking Room");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit.");
            System.out.println("SELECT FUNCTION: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    villaController.showAllVilla();
                    System.out.println("Select Villa: ");
                    String choiceVilla = scanner.nextLine();
                    BookingController.addBookingVilla(choiceVilla, choiceCustomer);
                    break;
                case "2":
                    houseController.showAllHouse();
                    System.out.println("Select House: ");
                    String choiceHouse = scanner.nextLine();
                    BookingController.addBookingHouse(choiceHouse, choiceCustomer);
                    break;
                case "3":
                    roomController.showAllRoom();
                    System.out.println("Select Room: ");
                    String choiceRoom = scanner.nextLine();
                    BookingController.addBookingRoom(choiceRoom, choiceCustomer);
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "5":
                    System.out.println("SEE YOU AGAIN");
                    System.exit(0);
                default:
                    System.err.println("SELECT FUNCTION AGAIN");
            }
        }
    }

    public static void manageCinemaService() {
        int noOfTickets = 5;
        Queue<Customer> customers = new ArrayDeque<>();
        while (true) {
            System.out.print("\nSelect an option from the list below:\n" +
                    "1.	Buy Cinema Ticket\n" +
                    "2.	Show All Customers\n" +
                    "3.	Back to menu\n" +
                    "4.	Exit\n" +
                    "Enter your choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    if (customers.size() >= noOfTickets) {
                        System.err.println("Out of movie tickets");
                    } else {
                        CinemaCotroller.buyCinemaTicket(customers);
                    }
                    break;
                case "2":
                    CinemaCotroller.showCinemaCustomer(customers);
                    break;
                case "3":
                    displayMainMenu();
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.err.println("SELECT FUNCTION AGAIN");
            }
        }
    }

    public static void manageFilingCabinets() {
        while (true) {
            System.out.print("\nSelect an option from the list below:\n" +
                    "1.	Show Filing Cabinets\n" +
                    "2.	Search Employee\n" +
                    "3.	Back to menu\n" +
                    "4.	Exit\n" +
                    "Enter your choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    FilingCabinets.showFilingCabinets();
                    break;
                case "2":
                    FilingCabinets.searchEmployee();
                    break;
                case "3":
                    displayMainMenu();
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.err.println("SELECT FUNCTION AGAIN");
            }
        }
    }
}

