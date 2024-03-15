package org.wayfarr.webwayfarr.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
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
