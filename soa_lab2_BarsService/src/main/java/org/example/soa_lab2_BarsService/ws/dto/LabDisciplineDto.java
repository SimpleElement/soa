package org.example.soa_lab2_BarsService.ws.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LabDisciplineDto {
    private Long id;

    private String name;

    private String authorName;
}
