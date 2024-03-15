package org.wayfarr.webwayfarr.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.wayfarr.webwayfarr.Shared.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Transactional
@Table(name = "comentarios")
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
