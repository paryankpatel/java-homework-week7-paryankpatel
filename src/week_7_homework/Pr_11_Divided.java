package week_7_homework;
/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5
 * separately.
 */
public class Pr_11_Divided {
    public static void main(String[] args) {
        div5();
        Pr_11_Divided obj = new Pr_11_Divided();
        obj.div3();
    }

    public void div3() {
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void div5() {
        System.out.println("Divided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

    }
}