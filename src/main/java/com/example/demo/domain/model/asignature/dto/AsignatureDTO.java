package com.example.demo.domain.model.asignature.dto;

import com.example.demo.domain.model.asignature.Asignature;
import com.example.demo.domain.model.asignature.AsignatureId;
import com.example.demo.domain.model.asignature.AsignatureName;
import com.example.demo.domain.model.student.*;
import com.example.demo.domain.model.student.dto.StudentDTO;

public class AsignatureDTO {
    private Long id;
    private String name;

    public AsignatureDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AsignatureDTO(Asignature asignature){
        this.id = asignature.getId().getValue();
        this.name = asignature.getName().getValue();
    }
    public Asignature asignatureDTOToValueObject (AsignatureDTO asignatureDTO){
        return new Asignature(
                new AsignatureId(asignatureDTO.getId()),
                new AsignatureName(asignatureDTO.getName()));
    }
    public AsignatureDTO ValueObjectToAsignatureDTO (Asignature asignature){
        return new AsignatureDTO(
                asignature.getId().getValue(),
                asignature.getName().getValue());
    }
}

