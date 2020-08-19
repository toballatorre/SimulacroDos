package cl.toballatorre.simulacrouno.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="DETALLEFACTURA")
public class DetalleFactura {
	
	@EmbeddedId
	private DetalleFacturaId id = new DetalleFacturaId();
	
	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("facturaId")
	@JoinColumn(name="FACTURA_FACTURAID")
	private Factura factura;
	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("productoId")
	@JoinColumn(name="PRODUCTO_PRODUCTOID")
	private Producto producto;
	private int cantidad;
	
	public DetalleFactura() {
		
	}
	
	public DetalleFactura(DetalleFacturaId id, Factura factura, Producto producto, int cantidad) {
		this.id = id;
		this.factura = factura;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public DetalleFacturaId getId() {
		return id;
	}

	public void setId(DetalleFacturaId id) {
		this.id = id;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
