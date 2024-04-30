package Ejercicio_2;

public class Academic extends Book{
    private String area;

    public Academic(String title, String author, int yearOfPublication, boolean lended, String area) {
        super(title, author, yearOfPublication, lended);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString()+" , Universitario - Materia: "+ area;
    }
}
