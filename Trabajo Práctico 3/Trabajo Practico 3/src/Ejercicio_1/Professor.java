package Ejercicio_1;

public class Professor extends Person{
    private String department;

    public Professor(int dni, String name, String department){
        super(dni, name);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
