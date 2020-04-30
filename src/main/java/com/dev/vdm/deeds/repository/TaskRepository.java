package com.dev.vdm.deeds.repository;

import com.dev.vdm.deeds.dto.TaskDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskDTO, Long> {
}
