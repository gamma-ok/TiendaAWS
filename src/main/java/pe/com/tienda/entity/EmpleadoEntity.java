package pe.com.tienda.entity;

import java.io.Serializable;
import java.time.LocalDate;
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

@Data //genera GET y SET
@AllArgsConstructor //metodo constructor con parametros
@NoArgsConstructor //metodo constructor sin parametros
@Builder //clase constructora
@Entity(name="EmpleadoEntity")// que sea una entidad
@Table(name="empleado") //relacionarlo con la tabla
public class EmpleadoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id //clave primaria
	@Column(name="codemp")//relacion con la columna
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincremento
	private long codigo;
	@Column(name = "nomemp",length = 40,nullable = false)
	private String nombre;
	@Column(name = "apepemp",length = 30,nullable = false)
	private String apellidoPaterno;
	@Column(name = "apememp",length = 30,nullable = false)
	private String apellidoMaterno;
	@Column(name = "dniemp",length = 8,nullable = false)
	private String dni;
	@Column(name = "fecemp", nullable = false)
	private LocalDate fecha;
	@Column(name = "diremp",length = 50,nullable = false)
	private String direccion;
	@Column(name = "telemp",length = 7,nullable = false)
	private String telefono;
	@Column(name = "celemp",length = 9,nullable = false)
	private String celular;
	@Column(name = "coremp",length = 40,nullable = false)
	private String correo;
	@Column(name = "sexemp",length = 9,nullable = false)
	private String sexo;
	@Column(name = "usuemp",length = 40,nullable = false)
	private String usuario;
	@Column(name = "claemp",length = 40,nullable = false)
	private String clave;
	@Column(name="estemp",nullable = false)
	private boolean estado;
	
	@ManyToOne //relacion de uno a muchos
	@JoinColumn(name = "coddis",nullable = false)//campo relacionado
	private DistritoEntity distrito;
	@ManyToOne 
	@JoinColumn(name = "codrol",nullable = false)
	private RolEntity rol;
	
}
