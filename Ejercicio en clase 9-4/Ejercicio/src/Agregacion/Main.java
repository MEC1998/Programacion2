package Agregacion;

public class Main {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();

        Departamento ventas = new Departamento("Ventas");
        Departamento contabilidad = new Departamento("Contabilidad");

        Empleado empleado1 = new Empleado("Vendedor", "Juan");
        Empleado empleado2 = new Empleado("Contador", "Maria");

        ventas.AgregarEmpleado(empleado1);
        contabilidad.AgregarEmpleado(empleado2);

        miEmpresa.AgregarDepartamento(contabilidad);
        miEmpresa.AgregarDepartamento(ventas);

        miEmpresa.MostrarDepartamentos();
    }
}
