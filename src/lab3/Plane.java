package lab3;

import java.util.Arrays;

public class Plane {
    // Instance variables based on class diagram [cite: 370, 374, 382, 384]
    private PlaneSeat[] seat;
    private int numEmptySeat;

    /**
     * Constructor for Plane[cite: 375, 384].
     * Initializes 12 seats and sets the empty seat count to 12.
     */
    public Plane() {
        this.seat = new PlaneSeat[12]; // Fleet capacity is 12
        for (int i = 0; i < 12; i++) {
            // Seat IDs are typically 1-based for the user [cite: 347, 442]
            this.seat[i] = new PlaneSeat(i + 1);
        }
        this.numEmptySeat = 12;
    }

    /**
     * Sorts seats by customerID in ascending order[cite: 376, 385].
     * Uses a copy of the original array.
     */
    private PlaneSeat[] sortSeats() {
        // Create a copy of the array
        PlaneSeat[] sortedSeats = Arrays.copyOf(this.seat, this.seat.length);

        // Simple selection sort to arrange by customerID
        for (int i = 0; i < sortedSeats.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < sortedSeats.length; j++) {
                if (sortedSeats[j].getCustomerID() < sortedSeats[minIdx].getCustomerID()) {
                    minIdx = j;
                }
            }
            // Swap
            PlaneSeat temp = sortedSeats[minIdx];
            sortedSeats[minIdx] = sortedSeats[i];
            sortedSeats[i] = temp;
        }
        return sortedSeats;
    }

    /**
     * Displays the total number of empty seats[cite: 377, 387].
     */
    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats.");
    }

    /**
     * Displays the list of empty seats[cite: 378, 388].
     */
    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (PlaneSeat s : seat) {
            if (!s.isOccupied()) {
                System.out.println("SeatID " + s.getSeatID());
            }
        }
    }

    /**
     * Displays assigned seats by seatID or customerID[cite: 379, 389, 390].
     */
    public void showAssignedSeats(boolean bySeatId) {
        PlaneSeat[] displayArray = bySeatId ? this.seat : sortSeats();
        System.out.println("The seat assignments are as follow:");
        for (PlaneSeat s : displayArray) {
            if (s.isOccupied()) {
                System.out.println("SeatID " + s.getSeatID() + " assigned to CustomerID " + s.getCustomerID() + ".");
            }
        }
    }

    /**
     * Assigns a seat to a customer if available[cite: 380, 391].
     */
    public void assignSeat(int seatId, int cust_id) {
        // Validation: Index check (SeatID 1 maps to index 0)
        if (seat[seatId - 1].isOccupied()) {
            System.out.println("Seat already assigned to a customer."); // [cite: 414, 455]
        } else {
            seat[seatId - 1].assign(cust_id);
            numEmptySeat--;
            System.out.println("Seat Assigned!"); // [cite: 435]
        }
    }

    /**
     * Unassigns a seat[cite: 381, 391].
     */
    public void unAssignSeat(int seatId) {
        if (seat[seatId - 1].isOccupied()) {
            seat[seatId - 1].unAssign();
            numEmptySeat++;
            System.out.println("Seat Unassigned!"); // [cite: 458]
        }
    }
}