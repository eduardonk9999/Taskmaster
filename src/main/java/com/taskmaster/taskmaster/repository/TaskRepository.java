package com.taskmaster.taskmaster.repository;

import com.taskmaster.taskmaster.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TaskRepository extends JpaRepository<Tasks, Long> {
}
