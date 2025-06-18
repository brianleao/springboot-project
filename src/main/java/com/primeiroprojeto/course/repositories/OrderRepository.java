package com.primeiroprojeto.course.repositories;

import com.primeiroprojeto.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
