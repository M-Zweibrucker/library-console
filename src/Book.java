import java.util.Date;

public class Book {
    private int id;
    private String title;
    private Author author;
    private Boolean available;
    private Date register_at;
    private Date updated_at;

    public Book (int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
        this.register_at = new Date();
        this.updated_at = new Date();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Boolean isAvailable() {
        return available;
    }

    public Date getRegister_at() {
        return register_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setTitle(String title){
        this.title = title;
        this.updated_at = new Date();
    }

    public void setAvailable(Boolean available){
        this.available = available;
    }

    @Override
    public String toString(){
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", available=" + available +
                ", registerDate=" + register_at +
                ", updatedDate=" + updated_at +
                '}';
    }
}
