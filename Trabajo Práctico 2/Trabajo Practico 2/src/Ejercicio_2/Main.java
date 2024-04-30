package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Library booksList =new Library();

        Novel book1 =new Novel("Viaje a Ixtlán", "Carlos Castaneda", 1972, true, "Realismo fantastico");
        Childish book2 =new Childish("El principito","Antoine de Saint-Exupéry", 1943, false, 4);
        Academic book3 =new Academic("Biología molecular de la célula", "Bruce Alberts", 2000, false, "Biología");

        booksList.addBook(book1);
        booksList.addBook(book2);
        booksList.addBook(book3);

        System.out.println("---------------------------");
        booksList.lendBook("El Hobbit");
        booksList.lendBook("El principito");

        System.out.println("---------------------------");
        booksList.restoreBook("Viaje a Ixtlán");

        System.out.println("---------------------------");
        booksList.listAvailableBooks();
    }
}