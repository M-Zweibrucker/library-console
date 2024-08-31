import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        Author author1 = new Author(1, "J.K. Rowling", new Date());
        Author author2 = new Author(2, "J.R.R. Tolkien", new Date());

        library.addAuthor(author1);
        library.addAuthor(author2);

        Book book1 = new Book(1, "Harry Potter e a Pedra Filosofal", author1);
        Book book2 = new Book(2, "O Senhor dos Anéis: A Sociedade do Anel", author2);
        Book book3 = new Book(3, "Harry Potter e a Câmara Secreta", author1);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        while(true){
            System.out.println("Do you like to see the available books? (yes/no)");
            String answer = scanner.nextLine().toLowerCase();

            if(answer.equals("yes")) {
                List<Book> availableBooks = library.showAvailableBooks();
                if(availableBooks.isEmpty()){
                    System.out.println("There are no books available");
                } else {
                    System.out.println("Books available");
                    for(Book book : availableBooks){
                        System.out.println(book.getId() + ": " + book.getTitle());
                    }

                    System.out.println("Type the id, that you want borrow:");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();

                    Book selectedBook = library.searchById(bookId);

                    if(selectedBook != null && selectedBook.isAvailable()){
                        System.out.println("Type your name:");
                        String userName = scanner.nextLine();

                        library.borrowBook(selectedBook, userName);
                        System.out.println("The book " + selectedBook.getTitle() + " has been borrow for " + userName);
                    } else {
                        System.out.println("The book was not find or available to borrow");
                    }
                }
            } else if (answer.equals("no")) {
                System.out.println("Thank you for using the library system");
                break;
            } else {
                System.out.println("Invalid answer. Please answer with 'yes' or 'no'");
            }
            scanner.close();
        }
    }
}