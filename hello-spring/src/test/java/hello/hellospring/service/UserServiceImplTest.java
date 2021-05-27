package hello.hellospring.service;

import hello.hellospring.User;
import hello.hellospring.controller.GetController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userServiceImple;
    @Test
    void getUsers() {
        User user1 = userServiceImple.getUsers();
        User user2 = new User(22,"Hong");
        assertThat(user1.getAge()).isEqualTo(user2.getAge());
    }
}