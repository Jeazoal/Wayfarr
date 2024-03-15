package org.wayfarr.webwayfarr.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.wayfarr.webwayfarr.Shared.BaseEntity;

@Data
public class Comentario extends BaseEntity {
    @Id
    @Column(name = "id_comentario")
    private Integer idcoment;
    @Column(name = "contenido")
    private String contenido;
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_publicacion", referencedColumnName = "id_publicacion")
    private Publicacion publicacion;
}
