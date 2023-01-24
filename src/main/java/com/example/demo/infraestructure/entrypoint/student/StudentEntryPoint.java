package com.example.demo.infraestructure.entrypoint.student;

import com.example.demo.domain.model.student.dto.StudentDTO;
import com.example.demo.domain.usecase.student.StudentUseCase;
import lombok.AllArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentEntryPoint {

    private final StudentUseCase studentUseCase;

    public ResponseEntity<?> saveStudent (@RequestBody StudentDTO studentDTO){
        try{
        return ResponseEntity.status(HttpStatus.CREATED).body(studentUseCase.saveStudent(studentDTO));
        }catch (Exception e){

        }
        return null;
    }
}
