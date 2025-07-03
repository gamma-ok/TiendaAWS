package pe.com.tienditaaws.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // genera GET y SET
@AllArgsConstructor // constructor con parámetros
@NoArgsConstructor // constructor sin parámetros
@Builder // clase constructora
@Entity(name = "SexoEntity") // que sea una entidad
@Table(name = "sexo") // relacionarlo con la tabla
public class SexoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id 
	@Column(name = "codsex") 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long codigo;
	@Column(name = "nomsex", length = 20, nullable = false)
	private String nombre;
	@Column(name = "estsex", nullable = false)
	private boolean estado;
}