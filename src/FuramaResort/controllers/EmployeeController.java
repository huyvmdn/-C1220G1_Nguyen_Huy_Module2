package FuramaResort.controllers;

import FuramaResort.Models.Employee;
import FuramaResort.commons.ReadAndWrite;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeController {

    private static int idEmployee;
    private static List<String[]> list;
    private static Map<Integer, Employee> map;

    static {
        list = ReadAndWrite.readFile("Employee.csv");
        idEmployee = 2021001;
        map = new TreeMap();
    }

    public static void showAllEmployee() {
        for (int i = 0; i < list.size(); i++) {
            Employee employee = new Employee(list.get(i));
            map.put(idEmployee, employee);
            idEmployee++;
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
