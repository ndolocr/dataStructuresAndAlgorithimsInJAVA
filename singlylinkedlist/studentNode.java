package singlylinkedlist;

import java.time.LocalDate;

public class studentNode {
    String gender;
    String lastName;
    int admissionNum;
    String firstName;
    String middleName;
    studentNode nextPointer;

    public studentNode(String gender, String lastName, int admissionNum, String firstName, String middleName) {
        this.gender = gender;
        this.lastName = lastName;
        this.admissionNum = admissionNum;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public void setNextPointer(studentNode nextPointer) {
        this.nextPointer = nextPointer;
    }

    public studentNode getNextPointer() {
        return nextPointer;
    }
}
