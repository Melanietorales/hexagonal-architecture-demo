package com.example.project.infraestructure.mapper;

import com.example.project.domain.model.Task;
import com.example.project.infraestructure.entity.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "status", target = "status"),
    }
    )

    Task toTask(TaskEntity task);
}
