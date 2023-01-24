package com.example.demo.infraestructure.adapters;

import com.example.demo.domain.model.asignature.Asignature;
import com.example.demo.domain.model.asignature.dto.AsignatureDTO;
import com.example.demo.domain.model.gateways.IAsignatureRepository;
import com.example.demo.domain.model.student.Student;
import com.example.demo.infraestructure.adapters.jpa.entity.AsignatureDBO;
import com.example.demo.infraestructure.adapters.jpa.entity.StudentDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AsignatureAdapterRepository implements IAsignatureRepository {
    private final IAsignatureAdapterRepository iAsignatureAdapterRepository;
    @Override
    public Asignature saveAsignature(Asignature asignature) {
        AsignatureDBO asignatureDBO = AsignatureDBO.asignatureDBOfromDomain(asignature);
        AsignatureDBO savedAsignature = iAsignatureAdapterRepository.save(asignatureDBO);
        Asignature asignatureConverted = savedAsignature.asignatureDBOToDomain(savedAsignature);
        return asignatureConverted;
    }
}
