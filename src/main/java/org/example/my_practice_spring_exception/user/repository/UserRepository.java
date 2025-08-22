package org.example.my_practice_spring_exception.user.repository;

import org.example.my_practice_spring_exception.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
