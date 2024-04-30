package Ejercicio_2;

public class Book implements Loanable{
    private String title;
    private String author;
    private int yearOfPublication;
    private boolean lended;

    public Book(String title, String author, int yearOfPublication, boolean lended){
        this.title=title;
        this.author=author;
        this.yearOfPublication=yearOfPublication;
        this.lended=false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean isLended() {
        return lended;
    }

    public void setLended(boolean lended) {
        this.lended = lended;
    }

    @Override
    public void lend(){
        this.lended=true;
    }

    @Override
    public void restore() {
        this.lended=false;
    }

    @Override
    public String toString() {
        return "Título: "+title+"\nAutor: "+author+"\nAño de publicación: "+yearOfPublication+"\nEstado: "+(lended ? "Prestado" : "Disponible");
    }
}
