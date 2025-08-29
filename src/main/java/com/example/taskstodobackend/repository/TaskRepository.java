package com.example.taskstodobackend.repository;

import com.example.taskstodobackend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
