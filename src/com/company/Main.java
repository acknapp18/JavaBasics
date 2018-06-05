package com.company;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        boolean hasADog = true;


        char favoriteLetter = 'c';


        String weather = "It is a hot day today";


        int numberOfStudentInClassroom = 1232;


        double averageGPA = 1232.02;
        char letter = 'w';

        double percentanswerscorrect = 23.09;


        boolean isLying = true;

        String rightPerson = "Abraham";

        int addition;

        int add = 5 + 4;
        int subtract = 5 - 4;
        int multiply = 5 * 4;
        int divide = 5 / 4;
//        System.out.println("The time of day is " + (5-2));


        //   System.out.println(divide);

        //   System.out.println("This is the modulo " + (4 % 5));
        //   This is an example of a concatenation
        String hello = "Hello";
        String name= "Crystal";

        System.out.println(hello + "");

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");

        name = input.nextLine();

        System.out.println(hello + " " + name);

        System.out.println("What greeting would you like?");
        hello = input.nextLine();

        System.out.println(hello + " " + name);

        System.out.println("What is your age?");
        int age = input.nextInt();

        System.out.println("What would you like for me to call you?");

        name = input.nextLine();

        System.out.println(hello + "! " + "You are " + age);















    }
}