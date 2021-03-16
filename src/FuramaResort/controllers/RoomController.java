package FuramaResort.controllers;

import FuramaResort.Models.Room;
import FuramaResort.Models.Services;
import FuramaResort.commons.ReadAndWrite;
import FuramaResort.commons.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RoomController extends ServicesController implements Regex, ReadAndWrite {

    public void addNewRoom(String choice) {
        serviceId = addSeviceID(choice);
        serviceName = addSeviceName();
        usableArea = addUsableArea();
        rentalCost = addRentalCost();
        maxNoOfPeople = addMaxNoOfPeople();
        rentalType = addRentalType();
        String otherFacilities;


        check = false;
        do {
            System.out.println("otherFacilities (massage | karaoke| food | drink| car)");
            otherFacilities = scanner.nextLine();
            check = otherFacilities.matches(OTHERFACIKITIES);
            if (!check) {
                System.err.println("Wrong input");
            }
        } while (!check);

        Services room = new Room(serviceId, serviceName, usableArea, rentalCost, maxNoOfPeople, rentalType, otherFacilities);
        List<Services> list = new ArrayList<Services>();
        list.add(room);
        ReadAndWrite.writeFile("Room.csv", list, true);
    }

    public void showAllRoom() {
        List<String[]> list = ReadAndWrite.readFile("Room.csv");
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            Services room = new Room(list.get(i)[0], list.get(i)[1], Double.parseDouble(list.get(i)[2]), Double.parseDouble(list.get(i)[3]), Integer.parseInt(list.get(i)[4]), list.get(i)[5], list.get(i)[6]);
            System.out.print(count + ". ");
            room.showInfor();
            count++;
        }
    }

    public void showAllRoomUnduplicated() {
        List<String[]> list = ReadAndWrite.readFile("Room.csv");
        int count = 1;
        Set<Services> servicesSet = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            Services room = new Room(list.get(i)[0], list.get(i)[1], Double.parseDouble(list.get(i)[2]), Double.parseDouble(list.get(i)[3]), Integer.parseInt(list.get(i)[4]), list.get(i)[5], list.get(i)[6]);
            servicesSet.add(room);
        }
        for (Services s : servicesSet) {
            System.out.print(count + ". ");
            s.showInfor();
        }

    }
}
