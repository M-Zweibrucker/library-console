import java.util.Date;

public class Borrow {
    private int id;
    private static int countId = 1;
    private Book book;
    private String userName;
    private Date borrow_at;
    private Date return_at;
    private Boolean active;

    public Borrow(Book book, String userName){
        this.id = countId++;
        this.book = book;
        this.userName = userName;
        this.borrow_at = new Date();
        this.active = true;
    }

    public int getId(){
        return id;
    }

    public Book getBook(){
        return book;
    }

    public String getUserName(){
        return userName;
    }

    public Date getBorrow_at(){
        return borrow_at;
    }

    public Date getReturn_at(){
        return return_at;
    }

    public boolean isActive(){
        return active;
    }

    public void returnBook(){
        this.return_at = new Date();
        this.active = false;
        this.book.setAvailable(true);
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "id=" + id +
                ", book=" + book +
                ", userName='" + userName + '\'' +
                ", borrowDate=" + borrow_at +
                ", returnDate=" + return_at +
                ", active=" + active +
                '}';
    }


}
