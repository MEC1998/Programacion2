package TP2;

public class Operario extends Empleado {

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Operario(String nombre, String cargo) {
        super(nombre);
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado: "+getNombre()+"\nCargo: "+cargo;
    }
}
