package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class PetShop extends Animal{
    private List <Animal> animals;

    public PetShop(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public void setAnimals(List<Animal> animals){
        this.animals = animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
        System.out.println("Se añadió un animal: "+getName());
    }

    public void listAnimals(){
        System.out.println("Lista de animales: ");
        for (Animal animal: animals){
            System.out.println("Animal: "+animal.getAnimalType()+"\nNombre: "+animal.getName()+"\nEdad: "+animal.getAge()+"\nPrecio: $"+animal.getPrice());
        }
    }

    public void feedAnimal(String name){
        boolean existenceAnimal = false;
        for (Animal animal:animals){
            if (name == animal.getName()){
            System.out.println(name+" ha sido alimentado");
            existenceAnimal=true;
            }
        }
        if (!existenceAnimal){
            System.out.println("El animal \""+name+"\" no se encientra en la tienda");
        }
    }

    public void sellAnimal(String name){
        boolean existenceAnimal = false;
        for (Animal animal: animals){
            if (name == animal.getName()){
                System.out.println("El animal "+animal.getName()+" ha sido vendido a $"+animal.getPrice());
                animals.remove(animal);
                existenceAnimal = true;
            }
        }
        if (!existenceAnimal){
            System.out.println(("El animal \""+name+"\" no se encuentra en la tienda"));
        }
    }
}
