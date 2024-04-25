package Agregacion;
import java.util.ArrayList;
import java.util.List;
public class Empresa {

    private List<Departamento> departamentos;

    public Empresa() {
        this.departamentos = new ArrayList<>();
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void AgregarDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public void MostrarDepartamentos(){
        System.out.println("Departamentos de la Empresa:");
        for (Departamento departamento: departamentos) {
            System.out.println(departamento.getNombre());
        }
    }
}
