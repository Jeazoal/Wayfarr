package org.wayfarr.webwayfarr.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

@Entity
@Data
@Transactional
@Table(name = "grupos")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo")
    private Integer idGrupo;

    @Column(name = "nombre_grupo")
    private String nombreGrupo;

    @Column(name = "descripcion_grupo")
    private String descripcionGrupo;
}
