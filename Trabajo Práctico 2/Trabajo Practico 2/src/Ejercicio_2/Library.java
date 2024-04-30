package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;

    public Library(){
        this.books= new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Libro \""+book.getTitle()+"\" agregado a la biblioteca.");
    }

    public void listAvailableBooks(){
        System.out.println("Libros disponibles en la bibliotecla:");
        for(Book book: books){
            System.out.println(book.getTitle()+ ", de "+book.getAuthor());
        }
    }

    public void lendBook(String title){
        for(int i=0;i<books.size();i++){
            if(books.get(i).getTitle().equals(title)){
                books.get(i).setLended(true);
                    System.out.println("El libro \""+title+"\" ha sido prestado.");

                return;
            }
        }
        System.out.println("El libro \""+title+"\" no está disponible en la biblioteca.");
    }

    public void restoreBook(String title){
        for(int i=0;i< books.size();i++){
            if(books.get(i).getTitle().equals(title)){
                books.get(i).setLended(false);
                    System.out.println("El libro \""+title+"\" fue devuelto.");
                return;
            }
        }
    }
}
