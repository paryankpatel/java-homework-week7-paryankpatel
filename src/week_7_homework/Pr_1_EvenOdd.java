package week_7_homework;
//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)
import java.util.Scanner;


public class Pr_1_EvenOdd {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int ans = scn.nextInt();

        String result = (ans % 2 ==0)? "Even" : "Odd";
        System.out.println(ans + " is " + result);
        scn.close();

    }
}
