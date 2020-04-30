package com.dev.vdm.deeds.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Builder
public class Task {

    private final String title;

    private final String description;

    @Setter
    private OffsetDateTime dueDate;
}
