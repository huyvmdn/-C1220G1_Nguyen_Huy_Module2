package FuramaResort.controllers;

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
//                    addNewServices()
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
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }
    public void addNewServies() {
        while (true) {
            System.out.print("\n--SELECT FUNCTION--\n"
                    + "1. Add New Services\n"
                    + "2. Show Services\n"
                    + "3. Add New Customer\n"
                    + "4. Show Information of Customer\n"
                    + "5. Add New Booking\n"
                    + "Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
//                    addNewServices()
                    break;
                case "2":
//                    showServices()
                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":
                    System.out.println("SEE YOU AGAIN");
                    System.exit(0);
                default:
                    System.out.println("VUI LÒNG CHỌN MỘT CHỨC NĂNG TRONG DANH SÁCH");
            }
        }
    }
}

