package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1 = getD1(sc, "Enter Numeric 1");

        double d2 = getD1(sc, "Enter Numeric 2");

        double result = d1 / d2;
        System.out.println("The answer is " + result);

        var addResult = addNumbers(d1,d1,d2,d1,d2);
        System.out.println("The result of adding " + d1 + "+" + d1 + "+" + d2+ "+" + d1 + "+" + d2 + " is :" + addResult);


    }

    private static double getD1(Scanner sc, String request) {
        System.out.print(request);
        return sc.nextDouble();
    }
    private static double addNumbers(double... values){
        double result =0 ;
        for(var value: values){
            result += value;
        }
        return result;
    }

}

