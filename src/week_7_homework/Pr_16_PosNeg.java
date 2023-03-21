package week_7_homework;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//        “ZERO”
import java.util.Scanner;

public class Pr_16_PosNeg {


        public static void main(String[] args) {

            Pr_16_PosNeg obj = new Pr_16_PosNeg();
            int num = obj.getInput();
            obj.checkNumber(num);


        }

        public int getInput() {
            // Get input from user
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int n = s.nextInt();
            s.close();
            return n;

        }


        public void checkNumber(int n) {

            if (n > 0) {
                System.out.println("Number is positive");
            } else if (n < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }
        }
    }

