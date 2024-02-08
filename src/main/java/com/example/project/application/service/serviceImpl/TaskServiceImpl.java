package com.example.project.application.service.serviceImpl;

import com.example.project.application.service.TaskService;
import com.example.project.domain.Port.TaskRepository;
import com.example.project.domain.model.Task;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    @Override
    public Task getTaskById(Integer id) {
        return this.taskRepository.getTaskById(id).get();
    }

    @Override
    public List<Task> getAllTasks() {
        return this.taskRepository.getAllTasks();
    }

    @Override
    public Task createTask(Task task) {
        return this.taskRepository.createTask(task);
    }

    @Override
    public Task updateTask(Task task) {
        return this.taskRepository.updateTask(task);
    }

    @Override
    public void deleteTask(Task task) {
        this.deleteTask(task);
    }
}
