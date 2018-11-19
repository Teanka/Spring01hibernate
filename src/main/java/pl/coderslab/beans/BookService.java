package pl.coderslab.beans;

//może wywoływać kilka metod Dao, sklejać w jedną metodę. Dodajemy transakcje.
public interface BookService {
    void save(Book book);

    void update(Book book);

    Book getById(Long id);

    void delete(Book book);

}
