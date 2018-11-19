package pl.coderslab.beans;

public interface BookDao {
    void saveBook(Book book);
    void editBook(Book book);
    Book getBookById(Long id);
//    List<Book> getAllBooks();
    void deleteBook(Book book);
}
