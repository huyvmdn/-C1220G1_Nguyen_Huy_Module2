package FuramaResort.controllers;

import FuramaResort.Models.Employee;
import FuramaResort.commons.ReadAndWrite;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeController {
    public static void showAllEmployee() {
        List<String[]> list = ReadAndWrite.readFile("Employee.csv");
        int idEmployee = 2021001;
        Map<Integer, Employee> map=new TreeMap();
        for (int i = 0; i < list.size(); i++) {
            Employee employee = new Employee(list.get(i));
            map.put(idEmployee,employee);
            idEmployee++;
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
