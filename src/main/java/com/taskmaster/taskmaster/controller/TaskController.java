package com.taskmaster.taskmaster.controller;

import com.taskmaster.taskmaster.model.Task;
import com.taskmaster.taskmaster.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService service;


    @PostMapping("addTask")
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        task newTask = service.addTask(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }
}
