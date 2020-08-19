package cl.toballatorre.simulacrouno.modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTO")
public class Producto {
	
	@Id
	@Column(name="PRODUCTOID")
	private int id;
	private String nombre;
	private long valor;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="CATEGORIA_CATEGORIAID")
	private Categoria categoria;
	
	@OneToMany(mappedBy = "producto", fetch = FetchType.EAGER)
	private Set<DetalleFactura> listaDetalleFactura;

	public Producto() {
		
	}
	
	public Producto(int id, String nombre, long valor, Categoria categoria) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<DetalleFactura> getListaDetalleFactura() {
		return listaDetalleFactura;
	}

	public void setListaDetalleFactura(Set<DetalleFactura> listaDetalleFactura) {
		this.listaDetalleFactura = listaDetalleFactura;
	}
}
