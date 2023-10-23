package org.example.soa_lab2_LabService.bars.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.soa_lab2_LabService.common.object.page.Page;


@Getter
@Setter
public class DisciplineFilter extends Page {
    private String name;
}
