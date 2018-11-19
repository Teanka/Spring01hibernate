package pl.coderslab.beans;

public interface AuthorService {


    void saveAuthor(Author author);
    void editAuthor(Author author);
    Author getAuthorById(Long id);
    void deleteAuthor(Author author);
}
