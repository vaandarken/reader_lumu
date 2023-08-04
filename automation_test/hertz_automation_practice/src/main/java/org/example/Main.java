package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        System.out.println("a:" + a );
        System.out.println("b:" + b);

        //swap values

        int storeNumber = a;
        a = b;
        b = storeNumber;

        //print the values

        System.out.println("a:" + a);
        System.out.println("b:" + b);

    }

    /*public static void swap(int a, int b){

    }*/
}