package FuramaResort.controllers;

import FuramaResort.Models.House;
import FuramaResort.Models.Services;
import FuramaResort.Models.Villa;
import FuramaResort.commons.ReadAndWrite;
import FuramaResort.commons.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HouseController extends ServicesController implements Regex, ReadAndWrite {
    public void addNewHouse(String choice) {
        serviceId = addSeviceID(choice);
        serviceName = addSeviceName();
        usableArea = addUsableArea();
        rentalCost = addRentalCost();
        maxNoOfPeople = addMaxNoOfPeople();
        rentalType = addRentalType();
        String standardRoom;
        String otherFacilities;
        int noOfFloors = 0;

        do {
            System.out.println("roomStandard (Abc)");
            standardRoom = scanner.nextLine();
            check = standardRoom.matches(SERVICE_NAME);
            if (!check) {
                System.err.println("Wrong input");
            }
        } while (!check);

        check = false;
        do {
            System.out.println("otherFacilities (massage | karaoke| food | drink| car)");
            otherFacilities = scanner.nextLine();
            check = otherFacilities.matches(OTHERFACIKITIES);
            if (!check) {
                System.err.println("Wrong input");
            }
        } while (!check);


        check = false;
        do {
            try {
                System.out.println("no Of Floors (Number>0)");
                noOfFloors = Integer.parseInt(scanner.nextLine());
                if (noOfFloors > 0) {
                    check = true;
                    break;
                }else {
                    System.err.println(" Wrong Input");
                }
            } catch (Exception e) {
                System.err.println(" Wrong Input");
            }
        } while (!check);


        Services house = new House(serviceId, serviceName, usableArea, rentalCost, maxNoOfPeople, rentalType, standardRoom, otherFacilities, noOfFloors);
        List<Services> list = new ArrayList<Services>();
        list.add(house);
        ReadAndWrite.writeFile("House.csv", list, true);
    }

    public void showAllHouse() {
        List<String[]> list = ReadAndWrite.readFile("House.csv");
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            Services house = new House(list.get(i));
            System.out.print(count + ". ");
            house.showInfor();
            count++;
        }
    }

    public void showAllHouseUnduplicated() {
        List<String[]> list = ReadAndWrite.readFile("House.csv");
        int count = 1;
        Set<Services> servicesSet = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            Services house = new House(list.get(i));
            servicesSet.add(house);
        }

        for (Services s : servicesSet) {
            System.out.print(count + ". ");
            s.showInfor();
            count++;
        }
    }
}
