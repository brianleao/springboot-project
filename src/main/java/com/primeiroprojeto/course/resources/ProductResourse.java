package com.primeiroprojeto.course.resources;
import com.primeiroprojeto.course.entities.Product;
import com.primeiroprojeto.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResourse {

    //para o spring fazer a injeção de dependencia automaticamente
    @Autowired
    //Dependencia
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {

        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
