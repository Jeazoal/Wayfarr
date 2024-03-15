package org.wayfarr.webwayfarr.Entity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;
import org.wayfarr.webwayfarr.Shared.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Transactional
@Table(name = "like_publicacion")
public class LikePublicacion extends BaseEntity{
    @Id
    @ManyToOne
    @JoinColumn(name = "id_like",referencedColumnName = "id_like")
    private Likes like;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_publicacion",referencedColumnName = "id_publicacion")
    private Publicacion publicacion;
    
}
