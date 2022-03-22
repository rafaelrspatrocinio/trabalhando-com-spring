package com.conceitosspring.aula1.repositories;

import com.conceitosspring.aula1.entities.OrderItem;
import com.conceitosspring.aula1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
