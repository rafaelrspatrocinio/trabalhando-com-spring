package com.conceitosspring.aula1.services;

import com.conceitosspring.aula1.entities.Order;
import com.conceitosspring.aula1.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> optional = repository.findById(id);

        return optional.get();
    }

}
