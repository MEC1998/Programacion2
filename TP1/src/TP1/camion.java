package TP1;

import javax.swing.*;

public class camion extends TP1.vehiculo{
    float carga;

    public camion(String duenio, int puertas, int ruedas, float carga) {
        super(duenio, puertas, ruedas);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public void cargar(){
        JOptionPane.showMessageDialog(null, "Cargando...");
    }

    @Override
    public void caracteristicas() {
        super.caracteristicas();
        JOptionPane.showMessageDialog(null, "Dueño: "+ duenio+"\nCant.Puertas: "+puertas+"\nCant.Ruedas: "+ruedas+"\nSu carga es de: "+carga+"KG");
    }
}
