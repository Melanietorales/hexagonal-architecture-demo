package com.example.project.application.service;

import com.example.project.domain.model.Task;
import java.util.List;

public interface TaskService {
    Task getTaskById(Integer id);

    //TODO agregar implementación de los métodos getAllTasks, createTask, updateTask y deleteTask
    List<Task> getAllTasks();
    Task createTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Task task);
}
