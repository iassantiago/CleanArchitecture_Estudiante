package com.example.demo.infraestructure.adapters.jpa.entity;

import com.example.demo.domain.model.asignature.Asignature;
import com.example.demo.domain.model.asignature.AsignatureId;
import com.example.demo.domain.model.asignature.AsignatureName;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "asignatures")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AsignatureDBO {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_asignature", nullable = false, unique = true)
    private Long id;
    private String name;
    public static AsignatureDBO asignatureDBOfromDomain (Asignature asignature){
        return new AsignatureDBO(
                asignature.getId().getValue(),
                asignature.getName().getValue());
    }
    public Asignature asignatureDBOToDomain (AsignatureDBO asignatureDBO) {
        return new Asignature(
                new AsignatureId(asignatureDBO.getId()),
                new AsignatureName(asignatureDBO.getName()));
    }
}
