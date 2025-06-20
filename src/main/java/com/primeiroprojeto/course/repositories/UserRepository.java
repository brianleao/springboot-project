package com.primeiroprojeto.course.repositories;

import com.primeiroprojeto.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> id(Long id);
}
