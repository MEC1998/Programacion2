public class BookText extends Book{
    private String curse;

    public BookText(String title, String author, float price, String curse) {
        super(title, author, price);
        this.curse = curse;
    }
    public String getCurse() {
        return curse;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }

    @Override
    public void data() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Curse: " + this.getCurse());
    }
}
