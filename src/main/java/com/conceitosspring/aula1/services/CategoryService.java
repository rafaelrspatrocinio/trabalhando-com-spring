package com.conceitosspring.aula1.services;

import com.conceitosspring.aula1.entities.Category;
import com.conceitosspring.aula1.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> optional = repository.findById(id);

        return optional.get();
    }

}
