package FuramaResort.controllers;

import FuramaResort.Models.Customer;
import FuramaResort.Models.Services;
import FuramaResort.commons.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerController implements Regex, ReadAndWrite {
    Scanner scanner = new Scanner(System.in);


    public Customer addNewCustomer() {
        String nameCustomer = addName();
        String birthdayCustomer = addBirthdayCustomer();
        String genderCustomer = addGenderCustomer();
        int identityCardCustomer = addIdentityCardCustomer();
        int phoneNumberCustomer = addPhoneNumberCustomer();
        String emailCustomer = addEmailCustomer();
        System.out.println("Type Of Guests Customer");
        String TypeOfGuestsCustomer = scanner.nextLine();
        System.out.println("adress Customer");
        String adressCustomer = scanner.nextLine();
        Services usingServiceCustomer = null;
        Customer customer = new Customer(nameCustomer, birthdayCustomer, genderCustomer, identityCardCustomer, phoneNumberCustomer, emailCustomer, TypeOfGuestsCustomer, adressCustomer, usingServiceCustomer);
        List<Customer> list = new ArrayList<Customer>();
        list.add(customer);
        ReadAndWrite.writeFile("Customer.csv", list, true);
        return customer;
    }

    public String addName() {

        String nameCustomer = "";
        do {
            try {
                System.out.println("Name Customer input: ");
                nameCustomer = scanner.nextLine();
                nameCustomer = Regex.nameStandard(nameCustomer);
                CustomerException.checkName(nameCustomer);
                return nameCustomer;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        } while (true);

    }

    public String addBirthdayCustomer() {

        String birthdayCustomer = null;
        do {
            try {
                System.out.println("Birthday Customer input: ");
                birthdayCustomer = scanner.nextLine();
                CustomerException.checkBirthday(birthdayCustomer);
                return birthdayCustomer;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        } while (true);

    }

    public String addGenderCustomer() {
        String genderCustomer;
        do {
            try {
                System.out.println("gender Customer Customer input (Male/Female): ");
                genderCustomer = scanner.nextLine();
                CustomerException.checkGender(genderCustomer);
                return genderCustomer;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    public int addIdentityCardCustomer() {

        String identityCardCustomer;
        do {
            try {
                System.out.println(" Identity Card Customer (XXXXXXXXX)");
                identityCardCustomer = scanner.nextLine();
                CustomerException.checkIdCard(identityCardCustomer);
                return Integer.parseInt(identityCardCustomer);
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        } while (true);

    }

    public int addPhoneNumberCustomer() {

        String addPhoneNumberCustomer;
        do {
            try {
                System.out.println(" phone number Customer (0XXXXXXXXX)");
                addPhoneNumberCustomer = scanner.nextLine();
                CustomerException.checkPhoneNumber(addPhoneNumberCustomer);
                return Integer.parseInt(addPhoneNumberCustomer);
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    public String addEmailCustomer() {
        String emailCustomer;
        do {
            try {
                System.out.println("Email Customer Customer input : ");
                emailCustomer = scanner.nextLine();
                CustomerException.checkEmail(emailCustomer);
                return emailCustomer;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }
    public void showCustomers() {
        List<String[]> list = ReadAndWrite.readFile("Customer.csv");
        List<Customer> listCustomer = new ArrayList<>();
        int count=1;
        for (int i = 0; i < list.size(); i++) {
            Customer customer = new Customer(list.get(i));
            System.out.print(count + ". ");
            customer.showInfo();
            count++;
        }
    }


    public void showInformationCustomers() {
        List<String[]> list = ReadAndWrite.readFile("Customer.csv");
        List<Customer> listCustomer = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Customer customer = new Customer(list.get(i));
            listCustomer.add(customer);
        }
        listCustomer.sort(Comparator.comparing(Customer::getName).thenComparing(Customer::getYearCustomer));
        int count=1;
        for (Customer customer : listCustomer) {

            System.out.print(count + ". ");
            customer.showInfo();
            count++;
        }
    }

}

