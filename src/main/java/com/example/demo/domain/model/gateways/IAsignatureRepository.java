package com.example.demo.domain.model.gateways;

import com.example.demo.domain.model.asignature.Asignature;
import com.example.demo.domain.model.asignature.dto.AsignatureDTO;

public interface IAsignatureRepository {
    Asignature saveAsignature(Asignature asignature);
}
