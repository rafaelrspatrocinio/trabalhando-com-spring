package com.conceitosspring.aula1.services;

import com.conceitosspring.aula1.entities.Product;
import com.conceitosspring.aula1.entities.User;
import com.conceitosspring.aula1.repositories.ProductRepository;
import com.conceitosspring.aula1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> optional = repository.findById(id);

        return optional.get();
    }

}
