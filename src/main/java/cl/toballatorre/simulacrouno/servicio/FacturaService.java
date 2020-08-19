package cl.toballatorre.simulacrouno.servicio;

import java.util.List;

import cl.toballatorre.simulacrouno.modelo.Factura;

public interface FacturaService {
	
	Factura getById(int id);
	List<Factura> getAll();
	void add(Factura f);
	void edit(Factura f);
	void delete(Factura f);
	void delete(int id);
}
