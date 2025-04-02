package hospitalRecords;

public class Staff {
    private String name;
    private int staffNo;
    private String gender;

    public Staff(String staffName, int workAdmNo, String sex){
        this.gender = sex;
        this.name = staffName;
        this.staffNo = workAdmNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", staffNo=" + staffNo +
                ", gender='" + gender + '\'' +
                '}';
    }
}
