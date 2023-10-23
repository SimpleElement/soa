package org.example.soa_lab2_LabService.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
public class PersonDto {
    private String name; //Поле не может быть null, Строка не может быть пустой

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private String birthday; //Поле не может быть null

    private String eyeColor; //Поле может быть null

    private String hairColor; //Поле может быть null

    private String nationality; //Поле может быть null

    private LocationDto location; //Поле может быть null
}
