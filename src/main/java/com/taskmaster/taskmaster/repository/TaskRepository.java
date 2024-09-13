package com.taskmaster.taskmaster.repository;

import com.taskmaster.taskmaster.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
