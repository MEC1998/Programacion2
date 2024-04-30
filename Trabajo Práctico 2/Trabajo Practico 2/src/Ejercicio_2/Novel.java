package Ejercicio_2;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, int yearOfPublication, boolean lended, String genre){
        super(title, author, yearOfPublication, lended);
        this.genre=genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString(){
        return super.toString()+" , Novela - Género: "+ genre;
    }
}
