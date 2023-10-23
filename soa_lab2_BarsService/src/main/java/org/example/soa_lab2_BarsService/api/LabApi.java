package org.example.soa_lab2_BarsService.api;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.example.soa_lab2_BarsService.ws.dto.DisciplineDto;
import org.example.soa_lab2_BarsService.ws.dto.DisciplineFilter;
import org.example.soa_lab2_BarsService.ws.dto.LabDisciplineDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class LabApi {

    @Value("${urls.labApi}")
    private String labUrpApi;

    private final RestTemplate restTemplate;

    public Object createDiscipline(DisciplineDto discipline) {
        return restTemplate.postForObject(labUrpApi, discipline, Object.class);
    }

    public Object getAllDiscipline(DisciplineFilter disciplineFilter) {
        Gson gson = new Gson();
        String json = gson.toJson(disciplineFilter);
        Map<String, Object> params = gson.fromJson(json, new TypeToken<Map<String, Object>>() {}.getType());

        return restTemplate.getForObject(labUrpApi, Object.class, params);
    }
}
