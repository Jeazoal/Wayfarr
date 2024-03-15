package org.wayfarr.webwayfarr.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;
import org.wayfarr.webwayfarr.Shared.BaseEntity;


@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Transactional
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @Column(name="id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iduser;
    @Column(name="username")
    private String username;
    @Column(name="correo")
    private String correo;
    @Column(name="password")
    private String password;
    @Column(name="sexo")
    private String sexo;
    @Column(name="foto")
    private String foto;
}
