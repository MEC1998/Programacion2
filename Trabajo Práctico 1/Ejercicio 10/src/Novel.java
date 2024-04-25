public class Novel extends Book{
    private String type;

    public Novel(String title, String author, float price, String type) {
        super(title, author, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void data() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Novel type: " + this.getType());
    }
}
