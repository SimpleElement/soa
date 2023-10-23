package org.example.soa_lab2_LabService.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
import org.example.soa_lab2_LabService.ws.validation.constraint.LabDtoConstraint;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Setter
@LabDtoConstraint
public class LabDto {
    private Long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически

    private String name; //Поле не может быть null, Строка не может быть пустой

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private String creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически

    private String minimalPoint; //Поле может быть null, Значение поля должно быть больше 0

    private String difficulty; //Поле не может быть null

    @Valid
    private CoordinatesDto coordinates; //Поле не может быть null

    @Valid
    private PersonDto author; //Поле может быть null
}
