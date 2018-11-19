package pl.coderslab.beans;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AuthorDaoImpl implements AuthorDao{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void saveAuthor(Author author) {
        entityManager.persist(author);
    }

    @Override
    public void editAuthor(Author author) {
        entityManager.merge(entityManager.contains(author) ?
                author: entityManager.merge(author));
    }

    @Override
    public Author getAuthorById(Long id) {
        return entityManager.find(Author.class, id);
    }

    @Override
    public void deleteAuthor(Author author) {
        entityManager.remove(entityManager.contains(author) ?
                author : entityManager.merge(author));
    }
}
