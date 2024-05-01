package Ejercicio_2;

public class Employee {
    private String name;
    private Employee supervisor;

    public Employee(String name){
        this.name=name;
    }

    public Employee(String name, Employee supervisor){
        this.name=name;
        this.supervisor=supervisor;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Employee getSupervisor(){
        return supervisor;
    }

    public void setSupervisor(Employee supervisor){
        this.supervisor=supervisor;
    }

    public String obtainSupervisorName(){
        if(supervisor!=null){
            return supervisor.getName();
        }else{
            return "Sin supervisor";
        }
    }
}
