
package com.argentinaprograma.tombazzi.Security.Repository;

import com.argentinaprograma.tombazzi.Security.Entity.Rol;
import com.argentinaprograma.tombazzi.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}