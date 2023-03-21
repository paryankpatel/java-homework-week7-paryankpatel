package week_7_homework;
/**
 * Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;

public class Pr_17_NumericArray {


    public static void main(String[] args) {

        int[] array1 = {40, 45, 78, 89, 34, 23, 32, 12, 21, 30, 9, 4, 11, 7, 5, 3};

        String[] array2 = {"Jonh", "Ana", "Jenny", "Emma", "Kerry", "Berry", "val"};

        System.out.println("Original numeric array :" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array :" + Arrays.toString(array1));

        System.out.println("Original string array :" + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array :" + Arrays.toString(array2));
    }
}
