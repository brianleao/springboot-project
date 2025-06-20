package com.primeiroprojeto.course.repositories;

import com.primeiroprojeto.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
