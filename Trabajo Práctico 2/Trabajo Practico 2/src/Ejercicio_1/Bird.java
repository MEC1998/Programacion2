package Ejercicio_1;

public class Bird extends Animal{
    private String species;
    private boolean speaks;

    public Bird(String name, int age, String animalType, double price, String species, boolean specks){
        super(name, age, animalType, price);
        this.species=species;
        this.speaks=speaks;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isSpeaks() {
        return speaks;
    }

    public void setSpeaks(boolean speaks) {
        this.speaks = speaks;
    }
}
