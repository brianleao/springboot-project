package com.primeiroprojeto.course.resourses;

import com.primeiroprojeto.course.entities.Order;
import com.primeiroprojeto.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResourse {

    //para o spring fazer a injeção de dependencia automaticamente
    @Autowired
    //Dependencia
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {

        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
