package Ejercicio_1;

public class Fish extends Animal{
    private String color;
    private boolean fromSea;

    public Fish(String name, int age, String animalType, double price, String color, boolean fromSea){
        super(name, age, animalType, price);
        this.color=color;
        this.fromSea=fromSea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFromSea() {
        return fromSea;
    }

    public void setFromSea(boolean fromSea) {
        this.fromSea = fromSea;
    }
}
