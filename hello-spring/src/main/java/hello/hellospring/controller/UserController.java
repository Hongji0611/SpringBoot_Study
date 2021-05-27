package hello.hellospring.controller;

import hello.hellospring.User;
import hello.hellospring.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/v1/profile")
    public User getParameter3(Model model){
        return userService.getUsers();
    }
}
