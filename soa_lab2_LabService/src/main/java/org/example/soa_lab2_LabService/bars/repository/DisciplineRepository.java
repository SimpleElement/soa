package org.example.soa_lab2_LabService.bars.repository;

import org.example.soa_lab2_LabService.bars.model.DisciplineEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplineRepository extends CrudRepository<DisciplineEntity, Long> {

    Page<DisciplineEntity> findAll(Pageable pageable);

    Page<DisciplineEntity> findAllByNameStartingWithIgnoreCase(String name, Pageable pageable);
}
