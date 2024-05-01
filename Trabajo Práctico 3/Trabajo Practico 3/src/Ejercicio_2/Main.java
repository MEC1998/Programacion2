package Ejercicio_2;

public class Main {
    public static void main(String[] args){

        Employee employee1=new Employee("Inés");
        Employee employee2=new Employee("Carlos", employee1);

        employee2.setSupervisor(employee1);

        String supervisorName=employee2.obtainSupervisorName();
        System.out.println("El supervisor de "+employee2.getName()+" es: "+supervisorName);
    }
}
