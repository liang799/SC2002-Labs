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


            System.out.println(calculateGrade(salary, merit));
        }
    }
    static String calculateGrade(int salary, int merit) {
        // 1. Handle Grade A / Upper B overlap
        if (salary >= 700 && salary <= 899) {
            return (merit >= 20) ? "A" : "B";
        }

        // 2. Handle Grade B / Lower C overlap
        if (salary >= 600 && salary < 700) {
            return (merit >= 10) ? "B" : "C";
        }

        // 3. Handle pure Grade C
        if (salary >= 500 && salary < 600) {
            return "C";
        }
        return "Invalid Salary";
    }

}
