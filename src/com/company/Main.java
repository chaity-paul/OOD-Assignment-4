package com.company;

import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Housing housing = new Housing("4th sciences building");
        Housing firstFloor = new Housing("1st floor");
        Housing secondFloor = new Housing("2nd floor");
        Housing thirdFloor = new Housing("3rd floor");
        Housing fourthFloor = new Housing("4th floor");

        Hashtable<Integer, Room> rooms = new Hashtable<>();

        for (int i = 1; i <= 4; i++) {
            for (int j = 101; j <= 110; j++) {

                String name = String.format("%d%d", i, j);
                Room room = new Room(name);
                if (i == 1) {
                    int x = firstFloor.addStructure(room);
                    rooms.put(x, room);
                } else if (i == 2) {

                    rooms.put(secondFloor.addStructure(room), room);
                } else if (i == 3) {
                    rooms.put(thirdFloor.addStructure(room), room);


                } else {
                    rooms.put(fourthFloor.addStructure(room), room);
                }
            }
        }
        int firstFloorNumber = housing.addStructure(firstFloor);
        int secondFloorNumber = housing.addStructure(secondFloor);
        int thirdFloorNumber = housing.addStructure(thirdFloor);
        int fourthFloorNumber = housing.addStructure(fourthFloor);
        Housing floor = (Housing) housing.getStructure(secondFloorNumber);
        housing.enter();
        floor.enter();

//        System.out.println(rooms.values());
        System.out.println(rooms.keySet());

        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter room number");
        x = sc.nextInt();
        Room room = (Room) floor.getStructure(x);
        room.enter();
        System.out.println("Thanks");
        room.exit();
        room.location();
        housing.exit();


    }
}