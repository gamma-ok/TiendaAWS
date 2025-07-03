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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="TicketPedidoEntity")
@Table(name="ticketpedido")
public class TicketPedidoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="nrotic")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numero;
	
	@Column(name="fectic",nullable = false)
	private LocalDate fecha;
	
	@Column(name="esttic",nullable = false)
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name="codcli",nullable = false)
	private ClienteEntity cliente;
	
	@ManyToOne
	@JoinColumn(name="codemp",nullable = false)
	private EmpleadoEntity empleado;
	
}
