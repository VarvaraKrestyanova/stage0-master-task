package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter + " x " + numberTableToPrint + " = " + numberTableToPrint * counter);
            counter++;
        }
    }

}
