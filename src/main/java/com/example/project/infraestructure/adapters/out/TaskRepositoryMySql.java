package com.example.project.infraestructure.adapters.out;

import com.example.project.domain.Port.TaskRepository;
import com.example.project.domain.model.Task;
import com.example.project.infraestructure.adapters.in.TaskCrudRepositorySql;
import com.example.project.infraestructure.entity.TaskEntity;
import com.example.project.infraestructure.exceptions.NotFoundException;
import com.example.project.infraestructure.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositoryMySql implements TaskRepository {

    private final TaskCrudRepositorySql taskCrudRepositorySql;

    @Autowired
    private TaskMapper taskMapper;

    public TaskRepositoryMySql(TaskCrudRepositorySql taskCrudRepositorySql) {
        this.taskCrudRepositorySql = taskCrudRepositorySql;
    }

    @Override
    public Optional<Task> getTaskById(Integer id) {
        TaskEntity task = this.taskCrudRepositorySql.findById(id).orElseThrow(
                ()-> new NotFoundException("Tarea no encontrada")
        );
        return Optional.of(this.taskMapper.toTask(task));
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public Task createTask(Task task) {
        return null;
    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }

    @Override
    public void deleteTask(Task task) {

    }
}
