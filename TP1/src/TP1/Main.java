package TP1;

public class Main {
    public static void main(String[] args) {
        auto auto1 = new auto("José", 5, 4, false);
        auto auto2 = new auto("Ramón",2,4, true);
        camion camion1 = new camion("Rogelio", 2, 6, 20000);

        auto1.caracteristicas();
        auto1.subir();
        auto1.bajar();
        auto2.caracteristicas();
        auto2.subir();
        auto2.bajar();
        camion1.cargar();
        camion1.caracteristicas();
    }
}
