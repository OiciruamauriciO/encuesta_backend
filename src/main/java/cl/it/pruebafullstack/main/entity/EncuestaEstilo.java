package cl.it.pruebafullstack.main.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="ENCUESTA_ESTILO")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EncuestaEstilo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5072522433615388603L;
	
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENCUESTA_ESTILO")
    Integer idEncuestaEstilo;    
        
    @Transient
    @ManyToOne
	@JoinColumn(name = "TIPO")
	private Estilo fkEncuestaEstiloEstilo;
	
    @Transient
    @ManyToOne()
	@JoinColumn(name = "ESTILO")
	private Encuesta fkEncuestaEstiloEncuesta;

}
