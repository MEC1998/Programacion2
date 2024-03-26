package TP1;

import javax.swing.*;

public class auto extends TP1.vehiculo{

    boolean descapotable;

    public auto(String duenio, int puertas, int ruedas, boolean descapotable) {
        super(duenio, puertas, ruedas);
        this.descapotable = descapotable;
    }

    public boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void bajar(){
        JOptionPane.showMessageDialog(null, "Bajando...");
    }
    public void subir(){
        JOptionPane.showMessageDialog(null, "Subiendo...");
    }

    @Override
    public void caracteristicas() {
        super.caracteristicas();
        JOptionPane.showMessageDialog(null, "Dueño: "+ duenio+"\nCant.Puertas: "+puertas+"\nCant.Ruedas: "+ruedas+"\nEs descapotable: "+descapotable);
    }

}
