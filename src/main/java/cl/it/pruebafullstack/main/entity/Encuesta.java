package cl.it.pruebafullstack.main.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="ENCUESTA")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Encuesta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6492366919716243328L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "IDENCUESTA")
    Integer idEncuesta;
	
    @Column(name = "ESTILO")
    Integer estilo;
    
    @Column(name = "CORREO")
    String correo;
    
    @Transient
    @OneToMany(mappedBy="fkEncuestaEstiloEncuesta")
    private List<EncuestaEstilo> encuestaestiloEncuesta;


}
