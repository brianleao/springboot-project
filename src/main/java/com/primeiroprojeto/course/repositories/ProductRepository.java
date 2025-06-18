package com.primeiroprojeto.course.repositories;

import com.primeiroprojeto.course.entities.Category;
import com.primeiroprojeto.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
