package com.example.demo.infraestructure.adapters.jpa.entity;

import com.example.demo.domain.model.student.*;
import com.example.demo.domain.model.student.dto.StudentDTO;
import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "students")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentDBO {
        @Id
        @GeneratedValue(strategy =  GenerationType.IDENTITY)
        @Column(name = "id_student", nullable = false, unique = true)
        private Long id;
        private String name;
        private Integer phone;
        private String email;

    public static StudentDBO studentDBOfromDomain (Student student){
        return new StudentDBO(
                student.getId().getValue(),
                student.getName().getValue(),
                student.getPhone().getValue(),
                student.getEmail().getValue());
    }
    public Student studentDBOToDomain (StudentDBO studentDBO) {
        return new Student(
                new StudentId(studentDBO.getId()),
                new StudentName(studentDBO.getName()),
                new StudentPhone(studentDBO.getPhone()),
                new StudentEmail(studentDBO.getEmail())
            );
        }
}
