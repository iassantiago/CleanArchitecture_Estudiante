package com.example.demo.aplication.configuration;

import com.example.demo.domain.model.gateways.IAsignatureRepository;
import com.example.demo.domain.model.gateways.IStudentRepository;
import com.example.demo.domain.usecase.asignature.AsignatureUseCase;
import com.example.demo.domain.usecase.student.StudentUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {
    @Bean
    public StudentUseCase studentUseCase(IStudentRepository iStudentRepository){
        return new StudentUseCase(iStudentRepository);
    }
   @Bean
    public AsignatureUseCase asignatureUseCase(IAsignatureRepository iAsignatureRepository){
            return new AsignatureUseCase(iAsignatureRepository);
    }
}
