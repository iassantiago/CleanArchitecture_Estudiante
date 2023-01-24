package com.example.demo.domain.usecase.student;

import com.example.demo.domain.model.gateways.IStudentRepository;
import com.example.demo.domain.model.student.Student;
import com.example.demo.domain.model.student.dto.StudentDTO;

public class StudentUseCase {
    private final IStudentRepository iStudentRepository;

    public StudentUseCase(IStudentRepository iStudentRepository) {
        this.iStudentRepository = iStudentRepository;
    }

    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentDTO.studentDTOToValueObject(studentDTO);

        return studentDTO.ValueObjectToStudentDTO(iStudentRepository.saveStudent(student));
    }
}
