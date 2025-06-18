package com.primeiroprojeto.course.repositories;

import com.primeiroprojeto.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
