package demo.springboot.web;

import demo.springboot.domain.Book;
import demo.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBookList() {
        return bookService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBook(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Book postBook(@RequestBody Book book) {
        return bookService.insertByBook(book);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Book putBook(@RequestBody Book book) {
        return bookService.update(book);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Book deleteBook(@PathVariable Long id) {
        return bookService.delete(id);
    }
}
