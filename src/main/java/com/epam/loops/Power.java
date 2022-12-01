package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int positivePowResult = 1;
        double negativePowResult = 1.0;

        if (power >= 0) {
            for (int i = 0; i < power; i++) {
                positivePowResult *= numberToPrint;
            }
            System.out.println(positivePowResult);
        } else {
            for (int i = 0; i < power * (-1); i++) {
                negativePowResult *= numberToPrint;
            }
            negativePowResult = 1 / negativePowResult;
            System.out.println(negativePowResult);
        }
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
