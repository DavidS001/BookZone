package dbva.bookzonelocal.web;

import dbva.bookzonelocal.service.KnigaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {

    private final KnigaService knigaService;

    public BooksController(KnigaService knigaService) {
        this.knigaService = knigaService;
    }

    @GetMapping("/knigi")
    public String showBooks(Model model){
        model.addAttribute("knigi",this.knigaService.listAll());
        return "knigi";
    }
}
