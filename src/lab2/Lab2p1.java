package lab2;

import java.util.Scanner;

import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nPerform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.print("m = ");
                    int m2 = sc.nextInt();
                    System.out.print("n = ");
                    int n2 = sc.nextInt();
                    System.out.println(m2 + " / " + n2 + " = " + divide(m2, n2));
                    break;
                case 3:
                    System.out.print("m = ");
                    int m3 = sc.nextInt();
                    System.out.print("n = ");
                    int n3 = sc.nextInt();
                    System.out.println(m3 + " % " + n3 + " = " + modulus(m3, n3));
                    break;
                case 4:
                    System.out.print("n : ");
                    int n4 = sc.nextInt();
                    int count = countDigits(n4);
                    System.out.println("count = " + (count < 0 ? "Error input!!" : count));
                    break;
                case 5:
                    System.out.print("n : ");
                    int n5 = sc.nextInt();
                    System.out.print("digit : ");
                    int d5 = sc.nextInt();
                    System.out.println("position = " + position(n5, d5));
                    break;
                case 6:
                    System.out.print("n : ");
                    long n6 = sc.nextLong();
                    long result = extractOddDigits(n6);
                    System.out.println("oddDigits = " + (result == -1 ? "Error input!!" : result));
                    break;
                case 7:
                    System.out.println("Program terminating ....");
                    break;
            }
        } while (choice < 7);
    }

    /* 3.2: Multiplication Test */
    public static void mulTest() {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < 5; i++) {
            int a = (int) (Math.random() * 10); // Random integer 0-9
            int b = (int) (Math.random() * 10);
            System.out.print("How much is " + a + " times " + b + "? ");
            int ans = sc.nextInt();
            if (ans == (a * b)) score++;
        }
        System.out.println(score + " answers out of 5 are correct.");
    }

    /* 3.3: Division by Subtraction */
    public static int divide(int m, int n) {
        int quotient = 0;
        while (m >= n) {
            m -= n;
            quotient++;
        }
        return quotient;
    }

    /* 3.4: Modulus by Subtraction */
    public static int modulus(int m, int n) {
        while (m >= n) {
            m -= n;
        }
        return m;
    }

    /* 3.5: Count Digits */
    public static int countDigits(int n) {
        if (n < 0) return -1;
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    /* 3.6: Position of a Digit */
    public static int position(int n, int digit) {
        int pos = 1;
        while (n > 0) {
            if (n % 10 == digit) return pos;
            n /= 10;
            pos++;
        }
        return -1;
    }

    /* 3.7: Extract Odd Digits */
    public static long extractOddDigits(long n) {
        if (n < 0) return -1;
        long result = 0;
        long multiplier = 1;
        boolean found = false;
        while (n > 0) {
            long digit = n % 10;
            if (digit % 2 != 0) {
                result = (digit * multiplier) + result;
                multiplier *= 10;
                found = true;
            }
            n /= 10;
        }
        return found ? result : -1;
    }
}