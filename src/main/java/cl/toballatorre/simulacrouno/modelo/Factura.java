package cl.toballatorre.simulacrouno.modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FACTURA")
public class Factura {
	
	@Id
	@Column(name="FACTURAID")
	private int id;
	private String cliente;
	private String fecha;
	
	@OneToMany(mappedBy = "factura", fetch = FetchType.EAGER)
	private Set<DetalleFactura> listaDetalleFactura;
	
	public Factura() {
		
	}
	
	public Factura(int id, String cliente, String fecha) {
		this.id = id;
		this.cliente = cliente;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Set<DetalleFactura> getListaDetalleFactura() {
		return listaDetalleFactura;
	}

	public void setListaDetalleFactura(Set<DetalleFactura> listaDetalleFactura) {
		this.listaDetalleFactura = listaDetalleFactura;
	}
	
	public long subtotal() {
		long suma = 0;
		Set<DetalleFactura> listaDetalle = this.getListaDetalleFactura();
		for (DetalleFactura detalle : listaDetalle) {
			suma += detalle.getProducto().getValor() * detalle.getCantidad();
		}
		return suma;
	}
	
	public long impuesto() {
		
		return (long) (this.subtotal() * 0.19);
	}
	
	public long total() {
		
		return this.subtotal() + this.impuesto();
	}
	
}
