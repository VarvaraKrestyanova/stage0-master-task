package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int res = number % 10 * 100 + number / 10 % 10 * 10 + number / 100;
        System.out.println(res);
    }

}
