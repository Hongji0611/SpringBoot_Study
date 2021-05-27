package hello.hellospring.user;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "user") //테이블과 링크될 클래스

public class UserEntity {
    @Id //해당 테이블의 PK필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성 규칙
    private Long id;

    @Column(length = 5, nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT", nullable = false)
    private int age;

    @Builder
    public UserEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
