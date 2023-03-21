package week_7_homework;
/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */
import java.util.Scanner;
public class Pr_6_IfOddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = scn.nextInt();
        scn.close();

        if (a % 2 == 0)
        {    System.out.println(a + "is even number "); }

        else
            System.out.println(a + " is odd number");


        }

    }



