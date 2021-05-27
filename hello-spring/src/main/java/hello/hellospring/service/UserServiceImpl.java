package hello.hellospring.service;

import hello.hellospring.User;
import hello.hellospring.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUsers() {
        User user = new User(22,"Hong");
        return user;
    }
}
