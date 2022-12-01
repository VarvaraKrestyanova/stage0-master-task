package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
        } else {
            int res = dividend / divider;
            System.out.println(res * divider == dividend ? "can be divided completely" : "cannot be divided completely");
        }
    }

}
