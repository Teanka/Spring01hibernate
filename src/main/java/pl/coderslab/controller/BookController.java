package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.beans.Book;
import pl.coderslab.beans.BookService;
import pl.coderslab.beans.Publisher;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/get/{id}")
    @ResponseBody
    public String findBook(@PathVariable Long id){
        Book book =  bookService.getById(id);
        return book.toString();
    }

    @GetMapping("/add")
    @ResponseBody
    public String addBook(){
        Book book = new Book("LotR", "JRR Tolkien", 10, new Publisher("Orbit"), "3 volumes");
        bookService.save(book);
        return "book added";
    }

    @GetMapping("/edit/{id}")
    @ResponseBody
    public String editBook(@PathVariable Long id){
        Book book = bookService.getById(id);
        book.setTitle("Lord of the Rings");
        bookService.update(book);
        return "book edited";
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String deleteBook(@PathVariable Long id){
        Book book = bookService.getById(id);
        bookService.delete(book);
        return "book deleted";
    }


}
