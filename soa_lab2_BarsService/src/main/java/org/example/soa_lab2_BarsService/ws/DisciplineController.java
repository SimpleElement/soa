package org.example.soa_lab2_BarsService.ws;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.soa_lab2_BarsService.api.LabApi;
import org.example.soa_lab2_BarsService.ws.dto.DisciplineDto;
import org.example.soa_lab2_BarsService.ws.dto.DisciplineFilter;
import org.example.soa_lab2_BarsService.ws.dto.LabDisciplineDto;
import org.example.soa_lab2_BarsService.ws.dto.LabFilter;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/bars/discipline")
@RequiredArgsConstructor
public class DisciplineController {

    private final LabApi labApi;

    @PostMapping
    public Object createDiscipline(@Valid @RequestBody DisciplineDto discipline) {
        return labApi.createDiscipline(discipline);
    }

    @GetMapping
    public Object getAllDiscipline(DisciplineFilter disciplineFilter) {
        return labApi.getAllDiscipline(disciplineFilter);
    }
//
//    @GetMapping("{id}/lab")
//    public PageResponse<LabDisciplineDto> getAllLab(@PathVariable Long id, LabFilter labFilter) {
//        Page<LabDisciplineEntity> page = disciplineService.getAllLabByDisciplineId(id, labFilter.getPageNumber(), labFilter.getPageSize());
//
//        PageResponse<LabDisciplineDto> response = conversionService.convert(page, PageResponse.class);
//        response.setContent(
//                page.getContent().stream()
//                        .map(labEntity -> conversionService.convert(labEntity, LabDisciplineDto.class))
//                        .collect(Collectors.toList())
//        );
//        return response;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteDisciplineById(@PathVariable Long id) {
//        this.disciplineService.deleteDisciplineById(id);
//    }
//
//    @PostMapping("/{disciplineId}/labwork/{labId}/add")
//    public void addLabToDiscipline(@PathVariable("disciplineId") Long disciplineId, @PathVariable("labId") Long labId) {
//        this.disciplineService.addLabToDiscipline(disciplineId, labId);
//    }
//
//    @DeleteMapping("/{disciplineId}/labwork/{labId}/remove")
//    public void removeLabToDiscipline(@PathVariable("disciplineId") Long disciplineId, @PathVariable("labId") Long labId) {
//        this.disciplineService.removeLabToDiscipline(disciplineId, labId);
//    }
}
