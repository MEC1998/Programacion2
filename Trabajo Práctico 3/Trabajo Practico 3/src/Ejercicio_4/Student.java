package Ejercicio_4;

public class Student {
    private String name;
    private int age;
    private double qualification;

    public Student(String name, int age, double qualification){
        this.name=name;
        this.age=age;
        this.qualification=qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("¡ERROR! La edad no puede ser negativa.");
        }
        this.age = age;
    }

    public double getQualification() {
        return qualification;
    }

    public void setQualification(double qualification) {
        if (qualification<0 || qualification>10){
            throw  new IllegalArgumentException("¡ERROR! La calificación no puede ser menor que 1 ni mayor que 10.");
        }
        this.qualification = qualification;
    }

    @Override
    public String toString(){
        return "Alumno{Nombre: \""+name+"\"|Edad: \""+age+"\"|Nota: \""+qualification+"\"}";
    }
}
