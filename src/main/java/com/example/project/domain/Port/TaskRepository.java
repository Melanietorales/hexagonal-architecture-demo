package com.example.project.domain.Port;

import com.example.project.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Optional<Task> getTaskById(Integer id);
    List<Task> getAllTasks();
    Task createTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Task task);
}
