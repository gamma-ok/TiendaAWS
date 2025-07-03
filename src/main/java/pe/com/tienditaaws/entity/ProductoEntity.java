package pe.com.tienditaaws.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
@Builder 
@Entity(name="ProductoEntity")
@Table(name="producto")
public class ProductoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id 
	@Column(name="codpro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)//autoincremento
	private long codigo;
	@Column(name = "nompro",length =40,nullable = false)
	private String nombre;
	@Column(name = "despro",length = 200,nullable = false)
	private String descripcion;
	@Column(name = "prepro",nullable = false)
	private double precio;
	@Column(name = "canpro",nullable = false)
	private int cantidad;
	@Column(name = "estpro",nullable = false)
	private boolean estado;
	
	@ManyToOne //relacion de uno a muchos
	@JoinColumn(name = "codmar",nullable = false)//campo relacionado
	private MarcaEntity marca;
	@ManyToOne 
	@JoinColumn(name = "codcat",nullable = false)
	private CategoriaEntity categoria;
}