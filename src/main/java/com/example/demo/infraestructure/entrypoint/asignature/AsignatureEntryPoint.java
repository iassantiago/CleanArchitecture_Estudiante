package com.example.demo.infraestructure.entrypoint.asignature;

import com.example.demo.domain.model.asignature.dto.AsignatureDTO;

import com.example.demo.domain.usecase.asignature.AsignatureUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asignature")
@AllArgsConstructor
public class AsignatureEntryPoint {
    private final AsignatureUseCase asignatureUseCase;

    @PostMapping
    public AsignatureDTO saveAsignature (@RequestBody AsignatureDTO asignatureDTO){
        return asignatureUseCase.saveAsignature(asignatureDTO);
    }
}
