package lab1;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double conversionRate = 1.82;

        System.out.print("starting : ");
        int start = sc.nextInt();
        System.out.print("ending : ");
        int end = sc.nextInt();
        System.out.print("increment : ");
        int increment = sc.nextInt();

        // Error Handling
        if (start > end) {
            System.out.println("Error input!!");
            return;
        }

        // 1. For Loop Table
        System.out.println("\nUS$         S$");
        System.out.println("--------------");
        for (int i = start; i <= end; i += increment) {
            System.out.printf("%-10d %.1f\n", i, i * conversionRate);
        }

        // 2. While Loop Table
        System.out.println("\nUS$         S$");
        System.out.println("--------------");
        int j = start;
        while (j <= end) {
            System.out.printf("%-10d %.1f\n", j, j * conversionRate);
            j += increment;
        }

        // 3. Do/While Loop Table
        System.out.println("\nUS$         S$");
        System.out.println("--------------");
        int k = start;
        if (k <= end) { // Guard to ensure do-while doesn't run if start > end (already handled above)
            do {
                System.out.printf("%-10d %.1f\n", k, k * conversionRate);
                k += increment;
            } while (k <= end);
        }

        sc.close();
    }
}