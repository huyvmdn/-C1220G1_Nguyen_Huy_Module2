package FuramaResort.controllers;

import FuramaResort.Models.Customer;
import FuramaResort.commons.ReadAndWrite;

import java.util.Queue;

public class CinemaCotroller implements ReadAndWrite {
    private static CustomerController customerController = new CustomerController();

    public static Queue<Customer> buyCinemaTicket(Queue<Customer> customers) {
        Customer customer = customerController.addNewCustomer();
        customers.add(customer);
        return customers;
    }

    public static void showCinemaCustomer(Queue<Customer> customers) {
        for (Customer c : customers) {
            c.showInfo();
        }
    }
}
