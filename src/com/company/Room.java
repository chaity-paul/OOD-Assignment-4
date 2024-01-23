package com.company;

public class Room implements IStructure {
    public String name;

    public Room(String name) {
        this.name = name;
    }

    public void enter() {
        System.out.println("You have entered the room " +
                this.getName());
    }

    public void exit() {
        System.out.println("You have left the room " +
                this.getName());
    }

    public void location() {
        System.out.println("You are currently in the room " +
                this.getName());
    }

    public String getName() {
        return this.name;
    }
   
}
