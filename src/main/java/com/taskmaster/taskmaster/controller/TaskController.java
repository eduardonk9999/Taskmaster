package com.taskmaster.taskmaster.controller;

import com.taskmaster.taskmaster.model.Tasks;
import com.taskmaster.taskmaster.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService service;


    @PostMapping("/addTask")
    public ResponseEntity<Tasks> addTask(@RequestBody Tasks task) {
        Tasks newTask = service.addTask(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Tasks>> getAllTasks() {
        List<Tasks> allTasks = service.getAllTasks();
        return new ResponseEntity<>(allTasks, HttpStatus.OK);
    }

}
