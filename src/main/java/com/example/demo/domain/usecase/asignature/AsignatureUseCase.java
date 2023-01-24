package com.example.demo.domain.usecase.asignature;

import com.example.demo.domain.model.asignature.Asignature;
import com.example.demo.domain.model.asignature.dto.AsignatureDTO;
import com.example.demo.domain.model.gateways.IAsignatureRepository;

public class AsignatureUseCase {
    private final IAsignatureRepository iAsignatureRepository;

    public AsignatureUseCase(IAsignatureRepository iAsignatureRepository) {
        this.iAsignatureRepository = iAsignatureRepository;
    }

    public AsignatureDTO saveAsignature(AsignatureDTO asignatureDTO) {
        Asignature asignature = asignatureDTO.asignatureDTOToValueObject(asignatureDTO);

        return asignatureDTO.ValueObjectToAsignatureDTO(iAsignatureRepository.saveAsignature(asignature));
    }
}
