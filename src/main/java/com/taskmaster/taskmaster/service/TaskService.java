package com.taskmaster.taskmaster.service;

import com.taskmaster.taskmaster.model.Tasks;
import com.taskmaster.taskmaster.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskService {

    @Autowired
    private TaskRepository repository;

    public Tasks addTask(Tasks task) {
        return repository.save(task);
    }

    public List<Tasks> getAllTasks() {
        return repository.findAll();
    }

}
