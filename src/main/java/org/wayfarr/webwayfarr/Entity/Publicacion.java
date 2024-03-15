package org.wayfarr.webwayfarr.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

@Data
@Entity
@Table(name = "publicaciones")
@Transactional
public class Publicacion {
    @Id
    @Column(name = "id_publicacion")
    private Integer idpubli;
    @Column(name = "imagen_url")
    private String imagenUrl;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "direccion ")
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;
}