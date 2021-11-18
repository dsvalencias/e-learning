package mx.com.gm.dao;
import mx.com.gm.domain.Persona;

import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    //Here you implement personalized SQL queries for your tabless
}
