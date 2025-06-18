package com.primeiroprojeto.course.services;

import com.primeiroprojeto.course.entities.Category;
import com.primeiroprojeto.course.entities.User;
import com.primeiroprojeto.course.repositories.CategoryRepository;
import com.primeiroprojeto.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
