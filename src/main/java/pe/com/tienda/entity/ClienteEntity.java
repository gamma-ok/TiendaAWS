package pe.com.tienda.entity;

import java.io.Serializable;
import java.sql.Date;
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
@Entity(name="ClienteEntity")
@Table(name="cliente")

public class ClienteEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="codcli")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@Column(name="nomcli",length = 40, nullable = false)
	private String nombre;
	
	@Column(name="apepcli",length = 40, nullable = false)
	private String apellidoPaterno;
	
	@Column(name="apemcli",length = 40, nullable = false)
	private String apellidoMaterno;
	
	@Column(name="doccli", length = 15, nullable = false)
	private String documento;
	
	@Column(name="feccli",nullable = false)
	private Date fecha;
	
	@Column(name="dircli",length = 100, nullable = false)
	private String direccion;
	
	@Column(name="telcli",length = 7,nullable = true)
	private String telefono;
	
	@Column(name="celcli",length = 9, nullable = false)
	private String celular;
	
	@Column(name="corcli",length = 7,nullable = true)
	private String correo;
	
	@Column(name="estcli", nullable = false)
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name="coddis",nullable = false)
	private DistritoEntity distrito;
	
	@ManyToOne
	@JoinColumn(name="codsex", nullable=false)
	private SexoEntity sexo;
	
	@ManyToOne
	@JoinColumn(name="codtipd", nullable=false)
	private TipoDocumentoEntity tipodocumento;
}
