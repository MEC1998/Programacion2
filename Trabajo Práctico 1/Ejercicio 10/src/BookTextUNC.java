public class BookTextUNC extends BookText{
    private String faculty;

    public BookTextUNC(String title, String author, float price, String curse, String faculty) {
        super(title, author, price, curse);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public void data() {
        super.data();
        System.out.println("Faculty: "+getFaculty());
    }
}