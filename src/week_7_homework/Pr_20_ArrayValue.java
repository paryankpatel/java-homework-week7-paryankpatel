package week_7_homework;
/**
        * Write a Java program to test if an array contains a specific value.
        */
import java.util.Scanner;

public class Pr_20_ArrayValue {
    public static void main(String[] args) {
        Pr_20_ArrayValue obj = new Pr_20_ArrayValue();
        obj.checkArrays();
    }

    public void checkArrays() {
        int a[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        boolean found = false;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number from 11 to 20");
        int ans = scn.nextInt();

        for (int i = 0; i < a.length; i++) {

            if (ans == a[i]) {
                System.out.println("Array contain given number");
                found = true; }


        }

        if (!found) {
            System.out.println("Array not contain given number");


        }

    }
}





