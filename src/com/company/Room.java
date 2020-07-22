package com.company;

public class Room {
    private int doors;
    private int cupboards;
    private int beds;
    private int chairs;
    private int desks;


    public Room(int doors, int cupboards, int beds, int chairs, int desks) {
        this.doors = doors;
        this.cupboards = cupboards;
        this.beds = beds;
        this.chairs = chairs;
        this.desks = desks;
    }
    public void zastanowienieSieNadDrzwiami(){
        openingTheDoor();
        System.out.println("Serio, są otwarte");
    }
    private void openingTheDoor(){
        System.out.println( doors + "Drzwi sie otwierają");
    }
}
