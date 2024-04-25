public class Manager extends Employee {

    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String organizeActivities(){
        String managerMessage = " organize activities in the "+ department;
        return managerMessage;
    }

}
