package org.wayfarr.webwayfarr.Shared;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.sql.Date;

@Data
@MappedSuperclass
public class BaseEntity {
    @Column(name = "estado_auditoria",insertable = false,updatable = false)
    private String estadoAuditoria;

    @Column(name = "user_creacion",updatable = false)
    private String userCreacion;

    @Column(name = "fecha_creacion",insertable = false,updatable = false)
    private Date fechaCreacion;

    @Column(name = "user_modificacion",insertable = false,updatable = false)
    private String userModificacion;

    @Column(name = "fecha_modificacion",insertable = false,updatable = false)
    private Date fechaModificacion;
}
