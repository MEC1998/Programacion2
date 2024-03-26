package TP2;

public class Directivo extends Empleado {

    String cargo;

    public Directivo(String nombre, String cargo) {
        super(nombre);
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado: "+getNombre()+"\nCargo: "+cargo;
    }
}
