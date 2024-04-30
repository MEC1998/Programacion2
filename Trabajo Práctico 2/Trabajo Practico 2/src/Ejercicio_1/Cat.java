package Ejercicio_1;

public class Cat extends Animal{
    private String breed;
    private boolean sterilized;

    public Cat(String name, int age, String animalType, double price, String breed, boolean sterilized){
        super(name, age, animalType, price);
        this.breed=breed;
        this.sterilized=sterilized;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }
}
