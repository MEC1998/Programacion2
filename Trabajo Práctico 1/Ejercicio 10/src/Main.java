public class Main {
    public static void main(String[] args) {

        System.out.println("Text book");
        BookText libroCurso = new BookText("Laboratorio","Juan Palotes",1500,"C4");
        libroCurso.data();
        System.out.println("--------");
        System.out.println("Universidad de Colombia text book");
        BookTextUNC libroUniversidad = new BookTextUNC("Matematicas III","Einstein",2500,"A1","Bogota");
        libroUniversidad.data();
        System.out.println("--------");
        System.out.println("Novel");
        Novel novela = new Novel("Los simuladores","Damian Szifron",2000,"Fiction");
        novela.data();
    }
}
