package org.wayfarr.webwayfarr.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;
import org.wayfarr.webwayfarr.Shared.BaseEntity;

@Entity
@Data
@Transactional
@Table(name = "Comentarios")
public class Comentario extends BaseEntity {
    @Id
    @Column(name = "id_comentario")
    private Integer idcoment;
    @Column(name = "contenido")
    private String contenido;
    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_publicacion", referencedColumnName = "id_publicacion")
    private Publicacion publicacion;
}