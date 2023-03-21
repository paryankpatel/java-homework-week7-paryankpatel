package week_7_homework;
//Write a Java program to calculate the average value of array elements.
public class Pr_19_AverageArray {

    public static void main(String[] args) {
        Pr_19_AverageArray obj = new Pr_19_AverageArray();
        obj.avgofArray();
    }

    //Calculate average value of array elements
    public void avgofArray(){

        int a[] = {1,2,3,4,5};
        float avg = 0;
        int sum = 0;
        System.out.println("Original array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        avg = sum/a.length;

        System.out.println("Average of given array is: " + avg);

    }
}

