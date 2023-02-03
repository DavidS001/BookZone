package dbva.bookzonelocal.web;

import dbva.bookzonelocal.model.Book;
import dbva.bookzonelocal.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/books/add-book")
    public String addBook(Model model){
        model.addAttribute("bodyContent","add-book");
        return "master-template";
    }

    @GetMapping("/books/{id}/edit-book")
    public String editBook(Model model,@PathVariable String id){
        Book book = this.bookService.findById(id);
        model.addAttribute("book",book);
        model.addAttribute("bodyContent","add-book");
        return "master-template";
    }

    @PostMapping("/books/save")
    public String save(@RequestParam String isbn,
                       @RequestParam String title,
                       @RequestParam(required = false) Integer rating,
                       @RequestParam Boolean forSale,
                       @RequestParam Integer price){
        this.bookService.saveBook(isbn, title, rating, forSale, price);
        return "redirect:/books";
    }

    @PostMapping("/books/{id}/edit")
    public String edit(@PathVariable String id,
                       @RequestParam String isbn,
                       @RequestParam String title,
                       @RequestParam(required = false) Integer rating,
                       @RequestParam Boolean forSale,
                       @RequestParam Integer price){
        this.bookService.editBook(id, isbn, title, rating, forSale, price);
        return "redirect:/books";
    }

    @PostMapping("/books/{id}/delete")
    public String delete(@PathVariable String id){
        this.bookService.delete(id);
        return "redirect:/books";
    }


}
