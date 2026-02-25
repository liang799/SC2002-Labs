package lab3;

import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Scanner sc = new Scanner(System.in);
        int choice;

        // Display the menu as specified in the lab manual
        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seat assignments by customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");

        do {
            System.out.print("\nEnter the number of your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    plane.showNumEmptySeats();
                    break;
                case 2:
                    plane.showEmptySeats();
                    break;
                case 3:
                    plane.showAssignedSeats(true); // bySeatId = true
                    break;
                case 4:
                    plane.showAssignedSeats(false); // bySeatId = false
                    break;
                case 5:
                    System.out.println("Assigning Seat ..");
                    System.out.print("  Please enter SeatID: ");
                    int seatId = sc.nextInt();
                    System.out.print("  Please enter Customer ID: ");
                    int custId = sc.nextInt();
                    plane.assignSeat(seatId, custId);
                    break;
                case 6:
                    System.out.print("  Enter SeatID to unassign customer from: ");
                    int unAssignId = sc.nextInt();
                    plane.unAssignSeat(unAssignId);
                    break;
                case 7:
                    // Option to terminate the program
                    break;
            }
        } while (choice != 7); // Continues until the user selects option 7
    }
}