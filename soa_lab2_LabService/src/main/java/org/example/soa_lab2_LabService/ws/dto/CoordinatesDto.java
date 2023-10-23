package org.example.soa_lab2_LabService.ws.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoordinatesDto {
    private String x;

    @Max(value = 395, message = "Максимальное значение поля Coordinates -> Y 395")
    private String y; //Максимальное значение поля: 395, Поле не может быть null
}
