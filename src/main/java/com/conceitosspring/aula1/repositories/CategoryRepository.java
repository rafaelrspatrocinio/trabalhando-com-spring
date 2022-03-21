package com.conceitosspring.aula1.repositories;

import com.conceitosspring.aula1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
