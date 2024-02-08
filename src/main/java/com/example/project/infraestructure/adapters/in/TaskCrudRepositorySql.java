package com.example.project.infraestructure.adapters.in;

import com.example.project.infraestructure.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;


public interface TaskCrudRepositorySql extends CrudRepository<TaskEntity, Integer>{
}
