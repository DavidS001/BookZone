package dbva.bookzonelocal.web;

import dbva.bookzonelocal.model.Book;
import dbva.bookzonelocal.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BooksController {

    private final BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String showBooks(Model model){
        List<Book> books = this.bookService.listAll();
        model.addAttribute("books",books);
        model.addAttribute("bodyContent","books");
        return "master-template";
    }
}
