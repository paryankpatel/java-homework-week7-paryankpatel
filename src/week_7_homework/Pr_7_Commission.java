package week_7_homework;
//Write a java program input sales id, seller's name, sales amount, and salary basic and
//        then fined this sales
//        Commission
//        Sales amount >= 50,000 35%
//        Sales amount >= 30,000 20%
//        >= 20,000 10%
//        >= 10,000 5%
//< 10,000 2%
import java.util.Scanner;


public class Pr_7_Commission {
    int salesId;
    String name;
    double salesamt;
    double salary;
    double comm;
    double grossincome;

    public static void main(String[] args) {

        Pr_7_Commission obj = new Pr_7_Commission();
        obj.getSellersData();
        obj.printSellersData();

    }

    public void getSellersData(){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Seller's name: ");
        name = s.next();
        System.out.println("Enter Seller's Id: ");
        salesId = s.nextInt();
        System.out.println("Enter sales amount: ");
        salesamt = s.nextDouble();
        System.out.println("Enter basic salary: ");
        salary = s.nextDouble();
        s.close();

        if(salesamt>=50000){

            comm = salary * 0.35;
        } else if (salesamt<50000 && salesamt>=30000){

            comm = salary * 0.2;
        } else if (salesamt<30000 && salesamt>=20000){

            comm = salary * 0.1;
        }else if (salesamt<20000 && salesamt>=10000){

            comm = salary * 0.05;
        } else {
            comm = salary * 0.2;
        }
        grossincome = comm + salary;
    }

    public void printSellersData(){

        System.out.println("Sales ID:        " + salesId + "");
        System.out.println("Sellers Name :    " + name + "");
        System.out.println("Sales Amount :    " + salesamt + "");
        System.out.println("Basic Salary :    " + salary + "");
        System.out.println("Commission   :    " + comm + "");
        System.out.println("Gross Salary :    " + grossincome + "");

    }
}


