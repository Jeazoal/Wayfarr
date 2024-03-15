package org.wayfarr.webwayfarr.Entity;

import org.wayfarr.webwayfarr.Shared.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Transactional
@Table(name = "likes")
public class Likes extends BaseEntity{
    @Id
    @Column(name="id_like")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idlike;
      @Column(name = "activo")
    private Integer activo;
    @Column(name = "estado_like")
    private Boolean estadoLike;
    @ManyToOne
    @JoinColumn(name = "id_publicacion")
    private Publicacion publicacion;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
