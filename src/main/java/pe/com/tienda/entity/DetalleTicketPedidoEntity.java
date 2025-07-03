package pe.com.tienda.entity;

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
@Entity(name="DetalleTicketPedidoEntity")
@Table(name="detalleticketpedido")
public class DetalleTicketPedidoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="nrodettic")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@ManyToOne
	@JoinColumn(name="nrotic",nullable = false)
	private TicketPedidoEntity ticketpedido;
	
	@ManyToOne
	@JoinColumn(name="codpro",nullable = false)
	private ProductoEntity producto;

	@Column(name="cantic",nullable = false)
	private int cantidad;
	
	@Column(name="pretic",nullable = false)
	private double precio;
	
	@Column(name="estdettick",nullable = false)
	private boolean estado;
}
