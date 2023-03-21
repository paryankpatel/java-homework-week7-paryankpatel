package week_7_homework;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
import java.util.Scanner;
public class Pr_9_SwitchStatement {


        public static void main(String[] args) {

            Pr_9_SwitchStatement obj = new Pr_9_SwitchStatement();
            char city = obj.getInput();
            obj.displayCityName(city);

        }

        public char getInput(){
            // Get input from user
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter any alphabet from A to F: ");
            char ch = s.next().charAt(0);
            s.close();
            return ch;

        }

        public void displayCityName(char ch){

            switch (ch){
                case 'A':
                    System.out.println("Ahmedabad");
                    break;
                case 'B':
                    System.out.println("Bangalaore");
                    break;
                case 'C':
                    System.out.println("Chandigadh");
                    break;
                case 'D':
                    System.out.println("Delhi");
                    break;
                case 'E':
                    System.out.println("Etah");
                    break;
                case 'F':
                    System.out.println("Faridabad");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        }
    }

