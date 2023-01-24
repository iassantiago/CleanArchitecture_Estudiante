package com.example.demo.infraestructure.adapters;

import com.example.demo.infraestructure.adapters.jpa.entity.AsignatureDBO;
import com.example.demo.infraestructure.adapters.jpa.entity.StudentDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAsignatureAdapterRepository extends JpaRepository<AsignatureDBO, Long>{
}
