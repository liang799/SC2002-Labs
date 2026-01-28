package lab1;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = sc.nextInt();

        if (height == 0) {
            System.out.println("Error input!!");
            return;
        }

        String current = "";
        for (int i = 0; i < height; i++) {
            int line = i + 1;

            if (line % 2 != 0) {
                current = "AA".concat(current);
            } else {
                current = "BB".concat(current);
            }

            System.out.println(current);
        }
    }
}
