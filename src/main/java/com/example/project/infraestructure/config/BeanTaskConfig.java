package com.example.project.infraestructure.config;

import com.example.project.application.service.TaskService;
import com.example.project.application.service.serviceImpl.TaskServiceImpl;
import com.example.project.domain.Port.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTaskConfig {
    @Bean
    TaskService productBeanService(final TaskRepository taskRepository){
        return new TaskServiceImpl(taskRepository);
    }
}
