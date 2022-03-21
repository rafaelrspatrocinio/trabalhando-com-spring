package com.conceitosspring.aula1.repositories;

import com.conceitosspring.aula1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
