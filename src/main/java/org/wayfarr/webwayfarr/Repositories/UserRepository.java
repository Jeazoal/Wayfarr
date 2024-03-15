package org.wayfarr.webwayfarr.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.wayfarr.webwayfarr.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Modifying
    @Transactional
    @Query("update User s set s.estadoAuditoria = '0' where s.iduser = :id")
    void deleteUser(@Param("id") Integer id);


}
