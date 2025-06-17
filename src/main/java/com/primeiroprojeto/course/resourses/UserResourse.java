package com.primeiroprojeto.course.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.primeiroprojeto.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Brian", "brianleao@icloud,com", "41997447795","123456");
        return ResponseEntity.ok().body(u);
    }
}
