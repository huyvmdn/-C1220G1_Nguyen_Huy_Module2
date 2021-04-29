package FuramaResort.controllers;

import FuramaResort.Models.Services;
import FuramaResort.Models.Villa;
import FuramaResort.commons.ReadAndWrite;
import FuramaResort.commons.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class VillaController extends ServicesController implements Regex, ReadAndWrite {

    public Services addNewVilla(String choice) {
        serviceId = addSeviceID(choice);
        serviceName = addSeviceName();
        usableArea = addUsableArea();
        rentalCost = addRentalCost();
        maxNoOfPeople = addMaxNoOfPeople();
        rentalType = addRentalType();
        String roomStandard;
        String otherFacilities;
        double poolArea = 0;
        int noOfFloors = 0;
        boolean check = false;
        check = false;
        do {
            System.out.println("roomStandard (Abc)");
            roomStandard = scanner.nextLine();
            check = roomStandard.matches(SERVICE_NAME);
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
                System.out.println("pool Area (Number >= 30m2)");
                poolArea = Double.parseDouble(scanner.nextLine());
                if (poolArea >= 30) {
                    check = true;
                    break;
                }else {
                    System.err.println(" Wrong Input");
                }
            } catch (Exception e) {
                System.err.println(" Wrong Input");
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

        Services villa = new Villa(serviceId, serviceName, usableArea, rentalCost, maxNoOfPeople, rentalType, roomStandard, otherFacilities, poolArea, noOfFloors);
        List<Services> list = new ArrayList<Services>();
        list.add(villa);
        ReadAndWrite.writeFile("Villa.csv", list, true);
        return villa;
    }

    public void showAllVilla() {
        List<String[]> list = ReadAndWrite.readFile("Villa.csv");
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            Services villa = new Villa(list.get(i));
            System.out.print(count + ". ");
            villa.showInfor();
            count++;
        }
    }

    public void showVillaUnduplicated() {
        List<String[]> list = ReadAndWrite.readFile("Villa.csv");
        Set<Services> servicesSet = new TreeSet<>();
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            Services villa = new Villa(list.get(i));
            servicesSet.add(villa);
        }
        for (Services s : servicesSet) {
            System.out.print(count + ". ");
            s.showInfor();
            count++;
        }
    }
}
