package pl.coderslab.beans;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveBook(Book book) {
        entityManager.persist(book);
    }

    @Override
    public void editBook(Book book) {
        entityManager.merge(entityManager.contains(book) ?
                book : entityManager.merge(book));
    }

    @Override
    public Book getBookById(Long id) {
        return entityManager.find(Book.class, id);
    }


    @Override
    public void deleteBook(Book book) {
        entityManager.remove(entityManager.contains(book) ?
                book : entityManager.merge(book));
    }
}
