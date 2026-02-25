package lab3;


public class PlaneSeat {
    // Private instance variables as defined in the class diagram
    private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seat_id) {
        this.seatId = seat_id;
        this.assigned = false; // Initially, seat is not assigned
        this.customerId = -1;  // Using -1 to represent no customer assigned
    }

    public int getSeatID() {
        return seatId;
    }

    public int getCustomerID() {
        return customerId;
    }

    public boolean isOccupied() {
        return assigned;
    }

    public void assign(int cust_id) {
        this.customerId = cust_id;
        this.assigned = true;
    }

    public void unAssign() {
        this.assigned = false;
        this.customerId = -1; // Reset to default state
    }
}