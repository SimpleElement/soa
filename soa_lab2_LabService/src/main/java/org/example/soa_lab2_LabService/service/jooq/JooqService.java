package org.example.soa_lab2_LabService.service.jooq;

import lombok.RequiredArgsConstructor;
import org.example.soa_lab2_LabService.model.entity.LabEntity;
import org.example.soa_lab2_LabService.service.repository.LabRepository;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.example.soa_lab2_LabService.generated.jooq.public_.tables.LabRef.LAB_REF;

@Repository
@RequiredArgsConstructor
public class JooqService {

    private final DSLContext dslContext;

    private final LabRepository labRepository;

    public Page<LabEntity> findAllLabByPredicate(Condition predicate, Sort sort, Integer pageNumber, Integer pageSize) {
        List<Long> ids = dslContext
                .select(LAB_REF.ID)
                .from(LAB_REF)
                .where(predicate)
                .fetch(LAB_REF.ID);

        return labRepository.findAllByIdIn(ids, PageRequest.of(pageNumber, pageSize, sort));
    }
}
