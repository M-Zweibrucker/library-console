import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books = new ArrayList<>();
    public List<Author> authors = new ArrayList<>();
    public List<Borrow> borrows = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> showAvailableBooks(){
        List<Book> availableBooks = new ArrayList<>();
        for(Book book : books) {
            if(book.isAvailable()){
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public Book searchById(int id){
        for(Book book : books){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public void updateBook(int id, String newTitle){
        for(Book book : books){
            if(book.getId() == id){
                book.setTitle(newTitle);
                break;
            }
        }
    }

    public void removeBook(int id){
        books.removeIf(book -> book.getId() == id);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> showAuthors(){
        return authors;
    }

    public void updateAuthor(int id, String newName){
        for(Author author : authors){
            if(author.getId() == id){
                author.setName(newName);
                break;
            }
        }
    }

    public void removeAuthor(int id){
        authors.removeIf(author -> author.getId() == id);
    }

    public void borrowBook(Book book, String userName){
        if(book.isAvailable()){
            Borrow borrow = new Borrow(book, userName);
            borrows.add(borrow);
            book.setAvailable(false);
        } else {
            System.out.println("The book is not available for borrow");
        }
    }

    public void returnBook(int borrowId){
        for(Borrow borrow : borrows){
            if(borrow.getId() == borrowId && borrow.isActive()){
                borrow.returnBook();
                break;
            }
        }
    }

    public List<Borrow> showBorrows(){
        return borrows;
    }
}
