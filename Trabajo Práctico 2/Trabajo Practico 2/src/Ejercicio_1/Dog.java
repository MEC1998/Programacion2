package Ejercicio_1;

public class Dog extends Animal{
    private String breed;
    private boolean vaccinated;

    public Dog(String name, int age, String animalType, double price, String breed, boolean vaccinated) {
        super(name, age, animalType, price);
        this.breed = breed;
        this.vaccinated = vaccinated;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
