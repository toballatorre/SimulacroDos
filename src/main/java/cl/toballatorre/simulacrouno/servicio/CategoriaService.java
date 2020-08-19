package cl.toballatorre.simulacrouno.servicio;

import java.util.List;

import cl.toballatorre.simulacrouno.modelo.Categoria;

public interface CategoriaService {
	
	Categoria getById(int id);
	List<Categoria> getAll();
	void add(Categoria c);
	void edit(Categoria c);
	void delete(Categoria c);
	void delete(int id);

}
