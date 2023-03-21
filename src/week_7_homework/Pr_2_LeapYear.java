package week_7_homework;
/*
  * Write a java program to input any year like (ex.2007) and find out if it is leap year or
  *    not?

 */
import java.util.Scanner;

public class Pr_2_LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scn.nextInt();

        boolean isLeapYear = false;
        if ( year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;

            }
        }
           if (isLeapYear) {
               System.out.println( year + "is a leap year.");

           } else {
               System.out.println( year + " is not a leap year.");
           }
        scn.close();
    }
}
