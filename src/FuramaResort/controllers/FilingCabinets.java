package FuramaResort.controllers;

import FuramaResort.Models.Employee;
import FuramaResort.commons.ReadAndWrite;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets implements ReadAndWrite {
    static Stack<Employee> stack ;

    static {
        stack = new Stack<>();
        List<String[]> list = ReadAndWrite.readFile("Employee.csv");
        for (String[] strings : list) {
            Employee employee = new Employee(strings);
            stack.push(employee);
        }
    }

    public static void showFilingCabinets() {
        for (Employee employee : stack) {
            System.out.println(employee.showInfo());
        }
    }
    public static void searchEmployee() {
        System.out.println("Input the employee's name to search");
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        boolean check=false;
        for (Employee employee : stack) {
            if (employee.getNameEmployee().equals(input)){
            System.out.println(employee.showInfo());
            check=true;
            }
        }
        if (check=false) {
            System.err.println("No staff found");
        }
    }
}
