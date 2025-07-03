package pe.com.tienda.entity;

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

@Data //genera GET y SET
@AllArgsConstructor //metodo constructor con parametros
@NoArgsConstructor //metodo constructor sin parametros
@Builder //clase constructora
@Entity(name="RolEntity")// que sea una entidad
@Table(name="rol") //relacionarlo con la tabla
public class RolEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id //clave primaria
	@Column(name="codrol")//relacion con la columna
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincremento
	private long codigo;
	@Column(name = "nomrol",length = 30,nullable = false)
	private String nombre;
	@Column(name="estrol",nullable = false)
	private boolean estado;
	
}
