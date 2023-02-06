package dbva.bookzonelocal.web;

import dbva.bookzonelocal.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage(Model model){

        model.addAttribute("bodyContent","login");

        return "master-template";
    }

    @PostMapping
    public String login(@RequestParam String name,
                        @RequestParam String password){
        this.userService.loadUserByUsername(name);
        return "redirect:/books";
    }
}
