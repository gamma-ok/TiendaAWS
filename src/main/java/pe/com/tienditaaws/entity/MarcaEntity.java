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

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
@Builder 
@Entity(name="MarcaEntity")
@Table(name="marca") 
public class MarcaEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id 
	@Column(name="codmar")
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincremento
	private long codigo;
	@Column(name = "nommar",length = 40,nullable = false)
	private String nombre;
	@Column(name="estmar",nullable = false)
	private boolean estado;
}