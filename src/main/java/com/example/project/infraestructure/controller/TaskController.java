package com.example.project.infraestructure.controller;

import com.example.project.application.service.TaskService;
import com.example.project.domain.model.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("{taskId}")
    public ResponseEntity<Task> findTaskById(
            @PathVariable Integer taskId
    ){
        return new ResponseEntity<>(taskService.getTaskById(taskId), HttpStatus.OK);
    }

}
