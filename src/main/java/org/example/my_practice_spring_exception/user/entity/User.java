package org.example.my_practice_spring_exception.user.entity;

import jakarta.persistence.*;
import jakarta.servlet.ServletRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 10, nullable = false)
    private String username;
    @Column(length = 30, nullable = false, unique = true)
    private String email;
    @Column(length = 50, nullable = false)
    private String password;

    @Builder
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
