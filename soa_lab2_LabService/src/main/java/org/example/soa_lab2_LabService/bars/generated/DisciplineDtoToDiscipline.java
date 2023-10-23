package org.example.soa_lab2_LabService.bars.generated;


import org.example.soa_lab2_LabService.bars.dto.DisciplineDto;
import org.example.soa_lab2_LabService.bars.model.DisciplineEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DisciplineDtoToDiscipline implements Converter<DisciplineDto, DisciplineEntity> {

    @Override
    public DisciplineEntity convert(DisciplineDto source) {
        DisciplineEntity res = new DisciplineEntity();

        res.setId(source.getId());
        res.setName(source.getName());
        res.setDescription(source.getDescription());
        return res;
    }
}
