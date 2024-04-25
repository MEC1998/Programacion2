import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Ayrton", 34, 10000, "Finance department");
        Manager manager2 = new Manager("Fernando", 43, 8000, "Advertising department");
        Worker worker1 = new Worker("Michael", 55, 4000, "Assembly area");
        Worker worker2 = new Worker("Carlos", 29, 5000, "Testing area");

        JOptionPane.showMessageDialog(null, "Job: Manager"+"\nName: "+manager1.getName()+"\nAge: "+manager1.getAge()+"\nLaboral sector: "+manager1.getDepartment()+"\nSalary: $"+manager1.getSalary()+"\nCurrent activity: "+manager1.goToWork()+manager1.organizeActivities());
        JOptionPane.showMessageDialog(null, "Job: Manager"+"\nName: "+manager2.getName()+"\nAge: "+manager2.getAge()+"\nLaboral sector: "+manager2.getDepartment()+"\nSalary: $"+manager2.getSalary()+"\nCurrent activity: "+manager2.goToWork()+manager2.organizeActivities());
        JOptionPane.showMessageDialog(null, "Job: Worker"+"\nName: "+worker1.getName()+"\nAge: "+worker1.getAge()+"\nLaboral sector: "+worker1.getArea()+"\nSalary: $"+worker1.getSalary()+"\nCurrent activity: "+worker1.goToWork()+worker1.produce());
        JOptionPane.showMessageDialog(null, "Job: Worker"+"\nName: "+worker2.getName()+"\nAge: "+worker2.getAge()+"\nLaboral sector: "+worker2.getArea()+"\nSalary: $"+worker2.getSalary()+"\nCurrent activity: "+worker2.goToWork()+worker2.produce());
    }
}
