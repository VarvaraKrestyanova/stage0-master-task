package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength * 2 - 1; j++) {
                if (j < cathetusLength - (i - 1)) {
                    System.out.print(" ");
                } else if (j > cathetusLength + (i - 1)) {
                    continue;
                } else {
                    System.out.print(j - (cathetusLength - 1) > 0 ? j - (cathetusLength - 1) : cathetusLength - (j - 1));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
