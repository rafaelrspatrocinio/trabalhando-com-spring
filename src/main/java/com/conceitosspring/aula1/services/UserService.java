package com.conceitosspring.aula1.services;

import com.conceitosspring.aula1.entities.User;
import com.conceitosspring.aula1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> optional = repository.findById(id);

        return optional.get();
    }

}
