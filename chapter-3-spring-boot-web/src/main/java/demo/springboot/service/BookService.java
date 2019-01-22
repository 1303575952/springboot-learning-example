package demo.springboot.service;

import demo.springboot.domain.Book;

import java.util.List;

public interface BookService {
    /**
     * 获取所有Book
     *
     * @return
     */
    List<Book> findAll();

    /**
     * 新增Book
     *
     * @param book
     * @return
     */
    Book insertByBook(Book book);

    /**
     * 更新Book
     *
     * @param book
     * @return
     */
    Book update(Book book);

    /**
     * 删除Book
     *
     * @param id
     * @return
     */
    Book delete(Long id);

    /**
     * 获取Book
     *
     * @param id
     * @return
     */
    Book findById(Long id);
}
