package org.wayfarr.webwayfarr.Entity;

import lombok.Data;
import org.wayfarr.webwayfarr.Shared.BaseEntity;

@Data
public class Comentario extends BaseEntity {
    private Integer idcoment;
    private String contenido;
    private User user;
    private Publicacion publicacion;
}
