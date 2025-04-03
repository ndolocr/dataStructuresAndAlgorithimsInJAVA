package hospitalRecords;

public class MainClass {
    public static void main(String[] args) {
        String about = """
        |************************************************************|
        This is a hospital record of staff that arrived to work 
        on Wedensday - 2nd April 2025. The record presents the staff
        record according to how they reported to work.
        |************************************************************|
        """;

        System.out.println(about);
        System.out.println();

        // Create staff details
        Staff staffOne = new Staff("James Kimani", 1, "M");
        Staff staffTwo = new Staff("Ann Muthoni", 2, "F");
        Staff staffThree = new Staff("Yakub Hussein", 3, "M");
        Staff staffFour = new Staff("Taabu Nyange", 4, "F");
        Staff staffFive = new Staff("Ruth Jubran", 5, "F");
        Staff staffSix = new Staff("Charles Kapala", 6, "M");

        StaffArrival arrivalOne = new StaffArrival("08:00", staffFive);
        StaffArrival arrivalTwo = new StaffArrival("08:02", staffOne);
        StaffArrival arrivalThree = new StaffArrival("08:12", staffThree);
        StaffArrival arrivalFour = new StaffArrival("08:25", staffSix);
        StaffArrival arrivalFive = new StaffArrival("08:32", staffTwo);
        StaffArrival arrivalSix = new StaffArrival("08:44", staffFour);

        // Create Linked List
        arrivalOne.setNextStaffPointer(staffOne);
        arrivalTwo.setNextStaffPointer(staffThree);
        arrivalThree.setNextStaffPointer(staffSix);
        arrivalFour.setNextStaffPointer(staffTwo);
        arrivalFive.setNextStaffPointer(staffFour);

        System.out.println("|************************************************************|");
        MainClass mc = new MainClass();
        System.out.println(mc.printStaffArrivalDetails(arrivalOne));

    }

    public String printStaffArrivalDetails(StaffArrival currentStaffArrival){
        String output = "";
         StaffArrival curent = currentStaffArrival;
        while(curent != null){
            output = output + curent.toString() + " --> ";
//            curent = curent.getNextStaffPointer();
        }
        output = output + " null";
        return output;
    }
}
