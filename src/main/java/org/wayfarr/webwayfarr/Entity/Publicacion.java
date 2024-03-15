package org.wayfarr.webwayfarr.Entity;

import lombok.Data;

@Data
public class Publicacion {
    private Integer idpubli;
    private String imagenUrl;
    private String descripcion;
    private String direccion;
    private User user;
}
