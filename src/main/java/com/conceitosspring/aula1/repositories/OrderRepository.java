package com.conceitosspring.aula1.repositories;

import com.conceitosspring.aula1.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
