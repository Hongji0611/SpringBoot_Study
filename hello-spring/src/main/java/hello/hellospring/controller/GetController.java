package hello.hellospring.controller;

import hello.hellospring.CalulationResult;
import hello.hellospring.OperandRequest;
import hello.hellospring.User;
import hello.hellospring.UserService;
import hello.hellospring.service.CalculateServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class GetController {
    @GetMapping("/v1/hello")
    public String getParameter(){
        return "Hello World!";
    }

    @GetMapping("/v1/class")
    public User getParameter2(){
        User user = new User(22,"jiwoo");
        return user;
    }

    @PostMapping("/v1/string")
    public String postMethod(@RequestBody String str){
        return str;
    }

    @PostMapping("/v1/profile")
    public User postMethod2(@RequestBody User user){
        return user;
    }

}
