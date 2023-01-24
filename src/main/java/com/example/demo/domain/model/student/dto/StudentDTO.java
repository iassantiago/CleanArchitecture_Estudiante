package com.example.demo.domain.model.student.dto;

import com.example.demo.domain.model.student.*;
import com.example.demo.infraestructure.adapters.jpa.entity.StudentDBO;

public class StudentDTO {
    private Long id;
    private String name;
    private Integer phone;
    private String email;

    public StudentDTO(Long id, String name, Integer phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Integer getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Student studentDTOToValueObject (StudentDTO studentDTO){
        return new Student(
                new StudentId(studentDTO.getId()),
                new StudentName(studentDTO.getName()),
                new StudentPhone(studentDTO.getPhone()),
                new StudentEmail(studentDTO.getEmail()));
    }
    public StudentDTO ValueObjectToStudentDTO (Student student){
        return new StudentDTO(
                student.getId().getValue(),
                student.getName().getValue(),
                student.getPhone().getValue(),
                student.getEmail().getValue());
    }
}
