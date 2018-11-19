package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void save(Book book) {
        bookDao.saveBook(book);
    }

    @Override
    public void update(Book book) {
        bookDao.editBook(book);
    }

    @Override
    public Book getById(Long id) {
        return bookDao.getBookById(id);
    }

    @Override
    public void delete(Book book) {
        bookDao.deleteBook(book);
    }
}
