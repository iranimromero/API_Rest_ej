package cl.iromero.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter //para acceder a este objeto
@Setter
@Entity //Persistencia de Datos, indica a Hibernate que haga una tabla de esta clase
public class Persona {
	
	@Id
	private Integer id;//Primary Key
	
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private Integer edad;
	
}
