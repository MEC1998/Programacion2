package Composicion;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa();
        casa1.AgregarPuerta("Madera");
        casa1.AgregarPuerta("Metal");
        casa1.AgregarPuerta("Vidrio");
        casa1.MostrarMaterialesPuertas();
    }
}
