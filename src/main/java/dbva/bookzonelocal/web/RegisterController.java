package dbva.bookzonelocal.web;

import dbva.bookzonelocal.model.Type;
import dbva.bookzonelocal.model.User;
import dbva.bookzonelocal.service.TypeService;
import dbva.bookzonelocal.service.UserService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class RegisterController {

    private final UserService userService;
    private final TypeService typeService;

    public RegisterController(UserService userService, TypeService typeService) {
        this.userService = userService;
        this.typeService = typeService;
    }

    @GetMapping("/register")
    public String registerPage(Model model){

        model.addAttribute("bodyContent","register");

        return "master-template";
    }

    @PostMapping("/register")
    public String register(@RequestParam String name,
                           @RequestParam String surname,
                           @RequestParam String password,
                           @RequestParam String phoneNumber,
                           @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date,
                           @RequestParam String type){
        Integer typeInt = Integer.parseInt(type);
        this.userService.create(name,surname,phoneNumber,password,date,typeInt);
        return "redirect:/books";
    }

}
