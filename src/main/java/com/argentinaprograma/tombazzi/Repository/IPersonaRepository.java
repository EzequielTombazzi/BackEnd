
package com.argentinaprograma.tombazzi.Repository;

import com.argentinaprograma.tombazzi.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
