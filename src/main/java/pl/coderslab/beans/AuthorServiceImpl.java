package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDao authorDao;

    @Override
    public void saveAuthor(Author author) {
        authorDao.saveAuthor(author);
    }

    @Override
    public void editAuthor(Author author) {
        authorDao.editAuthor(author);
    }

    @Override
    public Author getAuthorById(Long id) {
        return authorDao.getAuthorById(id);
    }

    @Override
    public void deleteAuthor(Author author) {
        authorDao.deleteAuthor(author);
    }
}
