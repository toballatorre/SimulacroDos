package cl.toballatorre.simulacrouno.servicio;

import java.util.List;

import cl.toballatorre.simulacrouno.modelo.Producto;

public interface ProductoService {
	
	Producto getById(int id);
	List<Producto> getAll();
	void add(Producto p);
	void edit(Producto p);
	void delete(Producto p);
	void delete(int id);

}
