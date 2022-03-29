package com.conceitosspring.aula1.services;

import com.conceitosspring.aula1.entities.Category;
import com.conceitosspring.aula1.entities.Product;
import com.conceitosspring.aula1.repositories.CategoryRepository;
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

    public Category insert(Category obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public Category update(Long id, Category obj){

        try {
            Category entity = repository.getById(id);
            updateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }

    }

    private void updateData(Category entity, Category obj) {
        entity.setName(obj.getName());
        entity.setProducts(obj.getProducts());
    }

}
