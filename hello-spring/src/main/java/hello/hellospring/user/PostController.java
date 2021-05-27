package hello.hellospring.user;

import hello.hellospring.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class PostController{
    @Autowired
    UserRepository userRepository;

    @PostMapping("/DB/add")
    public UserEntity addDB(@RequestBody UserEntity user){
        //given
        userRepository.save(UserEntity.builder()
                .name(user.getName())
                .age(user.getAge())
                .build());

        List<UserEntity> userList = userRepository.findAll();
        //then
        for(int i = 0; i<userList.size(); i++){
            if(userList.get(i).getName().equals(user.getName())){
                return userList.get(i);
            }
        }
        return null;
    }

    @PostMapping("/DB/find")
    public UserEntity findDB(@RequestBody String name){
        List<UserEntity> userList = userRepository.findAll();
        //then
        for(int i = 0; i<userList.size(); i++){
            if(userList.get(i).getName().equals(name)){
                return userList.get(i);
            }
        }
        return null;
    }

    @PostMapping("/DB/findAll")
    public List<UserEntity> findAllDB(){
        List<UserEntity> userList = userRepository.findAll();
        //then
        return userList;
    }

}
