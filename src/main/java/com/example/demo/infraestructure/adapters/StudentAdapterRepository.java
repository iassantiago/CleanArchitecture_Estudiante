package com.example.demo.infraestructure.adapters;

import com.example.demo.domain.model.gateways.IStudentRepository;
import com.example.demo.domain.model.student.Student;
import com.example.demo.infraestructure.adapters.jpa.entity.StudentDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class StudentAdapterRepository implements IStudentRepository {

    private final IStudentAdapterRepository iStudentAdapterRepository;
    @Override
    public Student saveStudent(Student student) {
        StudentDBO studentDBO = StudentDBO.studentDBOfromDomain(student);
        StudentDBO savedStudent = iStudentAdapterRepository.save(studentDBO);
        Student studentConverted = savedStudent.studentDBOToDomain(savedStudent);
        return studentConverted;
    }
}
