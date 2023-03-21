package week_7_homework;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */
import java.util.Scanner;

public class Pr_8_CityName {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any city name any alphabet from A TO F: ");
        String a = scn.next();
        if (a.equals("A"))
            { System.out.println("city name : Ahmedabad"); }
         else if (a.equals("B")) {
            System.out.println("city name : Bombay");
        } else if (a.equals("C")) {
            System.out.println("city name : chandigadh");
        } else if (a.equals("D")) {
            System.out.println("city name : delhi");
        } else if (a.equals("E")) {
            System.out.println("city name : Edmonton");
        } else if (a.equals("F")) {
            System.out.println("city name : Fresno");
        } else System.out.println("invalid input");

    }


    }




