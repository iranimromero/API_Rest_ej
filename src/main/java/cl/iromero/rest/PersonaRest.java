package cl.iromero.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.iromero.dao.PersonaDao;
import cl.iromero.model.Persona;

@RestController //indicamos que es un archivo tipo REST - interfaz entre sistemas que use HTTP para obtener datos o generar operaciones sobre esos datos en todos los formatos posibles, como XML y JSON
@RequestMapping("personas")	 //localhost:8083/personas/
public class PersonaRest {

		@Autowired //Inyeccion de dependencias
		private PersonaDao personaDao;
		
		//Solicitudes al Servidor - Metodos HTTP
		
		//Post - Peticion
		@PostMapping("/guardar")
		public void guardar(@RequestBody Persona persona) {
			personaDao.save(persona);
		}
		
		//Get
		@GetMapping("/listar")
		public List<Persona> guardar() {
			return personaDao.findAll();
		}
		
		//Delete
		@DeleteMapping("/eliminar/{id}")
		public void eliminar(@PathVariable("id") Integer id) {
			personaDao.deleteById(id);
		}
		
		//Put
		@PutMapping("/editar")
		public void editar(@RequestBody Persona persona) {
			personaDao.save(persona);
		}
		
		
		
}
