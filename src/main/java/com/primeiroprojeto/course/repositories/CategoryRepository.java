package com.primeiroprojeto.course.repositories;

import com.primeiroprojeto.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
