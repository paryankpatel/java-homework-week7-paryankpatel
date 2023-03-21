package week_7_homework;

import java.util.Scanner;

//Write a java program to input student Name, roll No, and three subjects Math, Science and
//        English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//        Input, Marks should between 0 to 100”) and find out total, percentage and result.
//        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
public class Pr_3_MarkSheet {
    String name;
    int rollno = 11;
    int maths;
    int science;
    int english;
    double total;
    double percentage;
    String result;
    String grade;

    public static void main(String[] args) {
Pr_3_MarkSheet obj = new Pr_3_MarkSheet();
obj.studentResult();
obj.printmarksheet();
    }
    public void studentResult(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter student name : ");
         name = scn.next();
        System.out.println("Enter roll no : ");
        rollno =scn.nextInt();
        System.out.println(" Enter maths marks : ");
        maths = scn.nextInt();
        System.out.println("Enter science marks : ");
        science = scn.nextInt();
        System.out.println("Enter english marks : ");
        english = scn.nextInt();
        scn.close();

        if (maths < 0 || maths > 100) {
            System.out.println("Invalid Input, marks should be between 0 to 100");
        }
        if (science < 0 || science > 100) {
            System.out.println("Invalid Input, marks should be between 0 to 100");
        }
        if (english < 0 || english > 100) {
            System.out.println("Invalid Input, marks should be between 0 to 100");
        }

        total = maths + english + science;
        percentage = (total / 300) * 100;

        if (percentage >=35) {
            result = "pass";
        } else {
            result = "fail";
        }
        if (percentage < 35) {
            grade = "F";
        }
        if (percentage >=35){
            grade = "C";
        }
        if (percentage >=50){
            grade = "B";
        }
        if (percentage >=60){
            grade = "A";
        }
        if (percentage >= 80) {
            grade = "A+";
        }

        }



    public void printmarksheet() {

        System.out.println("_______________________________________");
        System.out.println("|                                     |");
        System.out.println("|             Mark Sheet              |");
        System.out.println("|                                     |");
        System.out.println("|         Name:      " + name + "              |");
        System.out.println("|      Roll No:      " + rollno + "               |");
        System.out.println("|-------------------------------------|");
        System.out.println("|     Subjects:          Marks        |");
        System.out.println("|-------------------------------------|");
        System.out.println("|        Maths:      " + maths + "               |");
        System.out.println("|      English:      " + english + "               |");
        System.out.println("|      Science:      " + science + "               |");
        System.out.println("|-------------------------------------|");
        System.out.println("|        Total:      " + total + "            |");
        System.out.println("|-------------------------------------|");
        System.out.println("|   Percentage:      " + percentage + "             |");
        System.out.println("|       Result:      " + result + "             |");
        System.out.println("|        Grade:      " + grade + "               |");
        System.out.println("|-------------------------------------|");


    }

}