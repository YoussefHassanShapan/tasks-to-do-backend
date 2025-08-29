package com.example.taskstodobackend.repository;

import com.example.taskstodobackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
