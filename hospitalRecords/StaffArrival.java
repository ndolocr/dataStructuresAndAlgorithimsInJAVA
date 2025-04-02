package hospitalRecords;

public class StaffArrival {
    private String arrivalTime;
    private Staff currentStaff;
    private Staff nextStaffPointer;

    public StaffArrival(String timeOfArrival, Staff staffDetails){
        this.arrivalTime = timeOfArrival;
        this.currentStaff = staffDetails;
    }

    public void setNextStaffPointer(Staff nextStaffPointer) {
        this.nextStaffPointer = nextStaffPointer;
    }

    public Staff getNextStaffPointer() {
        return nextStaffPointer;
    }

    @Override
    public String toString() {
        return "StaffArrival{" +
                "arrivalTime='" + arrivalTime + '\'' +
                ", currentStaff=" + currentStaff.toString() +
                ", nextStaffPointer=" + nextStaffPointer +
                '}';
    }

    public String staffArrivalDetails(){
        String output = "";
        Staff currentStaffDetails = this.currentStaff;

        while(currentStaffDetails != null){
            output = output + currentStaff.toString() + " Arrival Time: " + this.arrivalTime + " --> ";

        }
        output = output + " null";
        return output;
    }
}
