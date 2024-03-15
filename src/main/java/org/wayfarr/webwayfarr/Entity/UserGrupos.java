package org.wayfarr.webwayfarr.Entity;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

@Data
@Entity
@Transactional
@Table(name = "users_grupos")
public class UserGrupos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users_grupos")
    private Long idUsersGrupos;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_grupo", referencedColumnName = "id_grupo")
    private Grupo grupo;
}
