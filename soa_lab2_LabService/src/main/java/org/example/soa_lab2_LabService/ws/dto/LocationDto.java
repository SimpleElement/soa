package org.example.soa_lab2_LabService.ws.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDto {
    private String name; //Поле не может быть null

    private String x; //Поле не может быть null

    private String y; //Поле не может быть null
}
