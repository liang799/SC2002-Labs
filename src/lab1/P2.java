package lab1;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Input salary: ");
            int salary = sc.nextInt();

            System.out.print("Input demerit points: ");
            int merit = sc.nextInt();

            char range = determineRange(salary);

            boolean isA_Range = range == 'A' && merit >= 20;
            boolean isB_range = (range == 'A' && merit < 20) || (range == 'B' && merit >= 10);
            boolean isC_range = (range == 'C') || (range == 'B' && merit < 10);

            if (isA_Range) {
                System.out.println("A");
            } else if (isB_range) {
                System.out.println('B');
            } else if (isC_range) {
                System.out.println('C');
            } else {
                System.out.println("Cannot determine");
            }

        }
    }

    static char determineRange(int salary) {
        if (salary < 900 && salary > 699) {
            return 'A';
        }

        if (salary >= 600 && salary < 799) {
            return 'B';
        }

        return 'C';
    }
}
