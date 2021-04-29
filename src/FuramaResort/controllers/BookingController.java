package FuramaResort.controllers;

import FuramaResort.Models.Customer;
import FuramaResort.commons.CustomerException;
import FuramaResort.commons.ReadAndWrite;
import FuramaResort.commons.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingController implements Regex, ReadAndWrite {
    static Scanner scanner = new Scanner(System.in);
    static boolean check = false;

    public static void addBookingVilla(String choice, Customer choiceCustomer) {
        int choiceVilla = Integer.parseInt(choice) - 1;
        List<String[]> list = ReadAndWrite.readFile("Villa.csv");
        choiceCustomer.setUsingServiceAddVilla(list.get(choiceVilla));
        List<String> listBooking = new ArrayList<>();
        listBooking.add(choiceCustomer.stringPlusUsingService());
        ReadAndWrite.writeFile("Booking.csv", listBooking, true);
    }

    public static void addBookingHouse(String choice, Customer choiceCustomer) {
        int choiceHouse = Integer.parseInt(choice) - 1;
        List<String[]> list = ReadAndWrite.readFile("House.csv");
        choiceCustomer.setUsingServiceAddHouse(list.get(choiceHouse));
        List<String> listBooking = new ArrayList<>();
        listBooking.add(choiceCustomer.stringPlusUsingService());
        ReadAndWrite.writeFile("Booking.csv", listBooking, true);
    }

    public static void addBookingRoom(String choice, Customer choiceCustomer) {
        int choiceRoom = Integer.parseInt(choice) - 1;
        List<String[]> list = ReadAndWrite.readFile("Room.csv");
        choiceCustomer.setUsingServiceAddRoom(list.get(choiceRoom));
        List<String> listBooking = new ArrayList<>();
        listBooking.add(choiceCustomer.stringPlusUsingService());
        ReadAndWrite.writeFile("Booking.csv", listBooking, true);
    }

    public static Customer choiceCustomer() {
        List<String[]> list = ReadAndWrite.readFile("Customer.csv");
        List<Customer> listCustomer = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Customer customer = new Customer(list.get(i));
            listCustomer.add(customer);
        }
        String choiceCustomer = null;
        do {
            try {
                System.out.println("choice Customer");
                choiceCustomer = scanner.nextLine();
                check = CustomerException.checkChoiceCustomer(choiceCustomer, listCustomer);

            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        } while (!check);
        return listCustomer.get((Integer.parseInt(choiceCustomer)) - 1);
    }
}
