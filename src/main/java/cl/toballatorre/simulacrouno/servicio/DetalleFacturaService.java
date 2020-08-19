package cl.toballatorre.simulacrouno.servicio;

import java.util.List;

import cl.toballatorre.simulacrouno.modelo.DetalleFactura;

public interface DetalleFacturaService {
	
	DetalleFactura getById(int id);
	List<DetalleFactura> getAll();
	void add(DetalleFactura df);
	void edit(DetalleFactura df);
	void delete(DetalleFactura df);
	void delete(int id);
}
