package cl.toballatorre.simulacrouno.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="CATEGORIA")
public class Categoria {
	
	@Id
	@Column(name="CATEGORIAID")
	private int id;
	private String nombre;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "categoria")
	private List<Producto> listaProductos;
	
	public Categoria() {
		
	}
	
	public Categoria(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

}
