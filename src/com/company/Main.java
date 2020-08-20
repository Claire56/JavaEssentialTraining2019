package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String girl = null;
        try {
            String g = girl.substring(1,2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("we still running!");
    }
}
