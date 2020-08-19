package cl.toballatorre.simulacrouno.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.toballatorre.simulacrouno.modelo.Producto;
import cl.toballatorre.simulacrouno.modelo.ProductoRepository;

@Service
public class ProductoImpl implements ProductoService {

	@Autowired
	ProductoRepository pr;
	
	@Override
	public Producto getById(int id) {
		// TODO Auto-generated method stub
		return pr.findOne(id);
	}

	@Override
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return (List<Producto>)pr.findAll();
	}

	@Override
	public void add(Producto p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public void edit(Producto p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public void delete(Producto p) {
		// TODO Auto-generated method stub
		pr.delete(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pr.delete(id);
	}

}
