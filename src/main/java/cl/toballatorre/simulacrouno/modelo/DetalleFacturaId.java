package cl.toballatorre.simulacrouno.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DetalleFacturaId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int facturaId;
	private int productoId;
	
	public DetalleFacturaId() {
		
	}
	
	public DetalleFacturaId(int facturaId, int productoId) {
		this.facturaId = facturaId;
		this.productoId = productoId;
	}

	public int getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(int facturaId) {
		this.facturaId = facturaId;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + facturaId;
		result = prime * result + productoId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleFacturaId other = (DetalleFacturaId) obj;
		if (facturaId != other.facturaId)
			return false;
		if (productoId != other.productoId)
			return false;
		return true;
	}

}
