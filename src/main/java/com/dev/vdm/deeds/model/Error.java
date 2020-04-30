package com.dev.vdm.deeds.model;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Error {

    private final String code;

    @Builder.Default
    private final String message = "";
}
