package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

public class Main {
    public static void main(String[] args) {
        List <Animal> animalList = new ArrayList<>();
        Dog dog1 = new Dog("Darwin", 5, "Perro", 10000, "Callejero", false);
        Dog dog2 = new Dog("Max", 8, "Perro", 15000, "Caniche", true);
        Cat cat1 = new Cat("India", 3, "Gato", 15000, "Mestizo", true);
        Bird bird1 = new Bird("Britney", 1, "Pajaro", 5000, "Cotorra", true);
        Fish fish1 = new Fish("Angel", 3, "Pez", 30000, "Blanco y negro", true);

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(cat1.toString());
        System.out.println(bird1.toString());
        System.out.println(fish1.toString());

        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(cat1);
        animalList.add(bird1);
        animalList.add(fish1);

        System.out.println("----------------");

        PetShop shop = new PetShop(animalList);

        shop.listAnimals();
        System.out.println("----------------");

        shop.feedAnimal("Darwin");
        shop.feedAnimal("José");
        System.out.println("----------------");

        shop.sellAnimal("Angel");

        shop.listAnimals();

    }
}