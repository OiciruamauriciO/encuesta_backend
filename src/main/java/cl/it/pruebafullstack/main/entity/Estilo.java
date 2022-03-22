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
@Table(name="ESTILO")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Estilo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -918316273135661669L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="IDESTILO")
	Integer idEstilo;

    @Column(name="TIPO")
	Integer tipo;		
	
    @Column(name="NOMBRE")
	String nombre;
		
    @Column(name="VOTOS")
	Integer votos;	
	
	@Transient
	@OneToMany(mappedBy="fkEncuestaEstiloEstilo")
	private List<EncuestaEstilo> encuestaestiloEstilo;

}
