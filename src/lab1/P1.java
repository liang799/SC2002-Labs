package lab1;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Input character:");
            char choice = sc.next().charAt(0);
            switch (choice) {
                case 'a':
                case 'A':
                    System.out.println("Action movie fan");
                    break;
                case 'c':
                case 'C':
                    System.out.println("Comedy movie fan");
                    break;
                case 'd':
                case 'D':
                    System.out.println("Drama movie fan");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
