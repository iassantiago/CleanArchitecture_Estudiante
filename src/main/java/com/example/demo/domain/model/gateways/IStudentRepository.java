package com.example.demo.domain.model.gateways;

import com.example.demo.domain.model.student.Student;
import com.example.demo.domain.model.student.dto.StudentDTO;

public interface IStudentRepository {
    Student saveStudent(Student student);
}
