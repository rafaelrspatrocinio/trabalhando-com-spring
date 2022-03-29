package com.conceitosspring.aula1.services;

import com.conceitosspring.aula1.entities.Order;
import com.conceitosspring.aula1.entities.Product;
import com.conceitosspring.aula1.repositories.OrderRepository;
import com.conceitosspring.aula1.services.exceptions.DatabaseException;
import com.conceitosspring.aula1.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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

    public Order insert(Order obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public Order update(Long id, Order obj){

        try {
            Order entity = repository.getById(id);
            updateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }

    }

    private void updateData(Order entity, Order obj) {
        entity.setOrderStatus(obj.getOrderStatus());
    }


}
