package hello.hellospring.user;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest{
    @Autowired
    UserRepository userRepository;

    @After //단위 테스트가 끝날 때마다 수행되는 메소드, DB 정리해줌
    public void cleanup() {
        userRepository.deleteAll();
    }

    @Test
    public void 저장내역_블러오기() {
        //given
        String name = "테스트";
        int age = 20;

        userRepository.save(UserEntity.builder()
                .name(name)
                .age(age)
                .build());

        //when
        List<UserEntity> userList = userRepository.findAll();

        //then
        UserEntity posts = userList.get(0);
        assertThat(posts.getName()).isEqualTo(name);
        assertThat(posts.getAge()).isEqualTo(age);
    }
}
