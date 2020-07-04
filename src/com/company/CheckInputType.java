package com.company;

import java.util.Scanner;

public class CheckInputType {
    public static double checkDouble () {
        Scanner scnFromConsole = new Scanner(System.in);
        while (!scnFromConsole.hasNextDouble()) {
            System.out.println("Вы ошиблись, пожалуйста, введите число");
            scnFromConsole.next();
        }
       double number = scnFromConsole.nextDouble();
        while (number == 0.0) {
            System.out.println("Вы ввели 0, пожалуйста, повторите ввод");
            number = scnFromConsole.nextDouble();
        }
        return number;
    }
    public static int checInt () {
        Scanner scnFromConsole = new Scanner(System.in);
        while (!scnFromConsole.hasNextInt()) {
            System.out.println("Вы ошиблись, пожалуйста, введите число");
            scnFromConsole.next();
        }
        return scnFromConsole.nextInt();
    }
    public static String checkStr(String checkFirstWord, String checkSecondWord) {
        Scanner scnFromConsole = new Scanner(System.in);
        String word =  "";
        while ((!word.equalsIgnoreCase(checkFirstWord)) && (!word.equalsIgnoreCase(checkSecondWord))) {
            word = scnFromConsole.nextLine();
            if (!word.equalsIgnoreCase(checkFirstWord) && (!word.equalsIgnoreCase("")) && (!word.equalsIgnoreCase(checkSecondWord))) {
                System.err.println("Вы ошиблись, пожалуйста, повторите ввод");
            }
        }
        return word;
    }
}
