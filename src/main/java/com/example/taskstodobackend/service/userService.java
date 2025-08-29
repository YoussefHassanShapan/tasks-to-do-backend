package com.example.taskstodobackend.service;

import com.example.taskstodobackend.model.User;
import com.example.taskstodobackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {
    private final UserRepository UserRepository;

    public userService(UserRepository UserRepository) {
        this.UserRepository = UserRepository;
    }
    public List<User> getAllUsers() {
        return UserRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return UserRepository.findById(id);
    }

    public User createUser(User User) {
        return UserRepository.save(User);
    }

    public User updateUser(Long id, User updatedUser) {
        return UserRepository.findById(id)
                .map(User -> {
                    User.setName(updatedUser.getName());
                    User.setAvatar(updatedUser.getAvatar());
                    return UserRepository.save(User);
                })
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void deleteUser(Long id) {
        UserRepository.deleteById(id);
    }
}
