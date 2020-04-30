package com.dev.vdm.deeds.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class TaskDTO {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    private OffsetDateTime dueDate;

    private Instant created;

    private Instant updated;
}
