package Ejercicio_1;

public class Animal {
    String name;
    int age;
    String animalType;
    double price;

    public Animal(String name, int age, String animalType, double price) {
        this.name = name;
        this.age = age;
        this.animalType = animalType;
        this.price = price;
    }

    public Animal() {
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
        this.age = age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void feed(String name){
        System.out.println(name+" esta comiendo");
    }

    @Override
    public String toString(){
        return "Nombre: "+name+"\nEdad: "+age+"\nTipo: "+animalType+"\nPrecio: $"+price;
    }


}
