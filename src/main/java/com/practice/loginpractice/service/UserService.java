package com.practice.loginpractice.service;


import com.practice.loginpractice.model.User;
import com.practice.loginpractice.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User createUser(User user) {
        var userToSave = User.builder()
                .name(user.getName())
                .email(user.getEmail())
                .address(user.getAddress())
                .password(user.getPassword())
                .build();

        return repository.save(userToSave);
    }

    public User findById(int id){
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<User> findAll(){
        return repository.findAll().stream().sorted(Comparator.comparing(User::getUserId)).toList();
    }

    public User updateUser(Integer id, User updatedUser){
        Optional<User> optionalUser = repository.findById(id);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();

            user.setName(updatedUser.getName());
            user.setName(updatedUser.getAddress());
            user.setName(updatedUser.getEmail());
            user.setName(updatedUser.getPassword());
            return repository.save(user);
        } else {
            throw new EntityNotFoundException("Entity with " + id + "not found");
        }
    }

    public void deleteById(int id){
        repository.deleteById(id);
    }


}
