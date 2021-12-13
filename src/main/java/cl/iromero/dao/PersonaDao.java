package cl.iromero.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sun.xml.bind.v2.model.core.ID;

import cl.iromero.model.Persona;

//indicamos que es un controlador utilizando Interface
//Entendemos de Jpa para aprovechar sus metodos y le pasamos nuestra entidad y el tipo de datos de su clave primaria
public interface PersonaDao extends JpaRepository<Persona, Integer>{
	
	
}
