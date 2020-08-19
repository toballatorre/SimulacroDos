package cl.toballatorre.simulacrouno.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.toballatorre.simulacrouno.modelo.Categoria;
import cl.toballatorre.simulacrouno.modelo.CategoriaRepository;

@Service
public class CategoriaImpl implements CategoriaService{

	@Autowired
	CategoriaRepository cr;
	
	@Override
	public Categoria getById(int id) {
		// TODO Auto-generated method stub
		return cr.findOne(id);
	}

	@Override
	public List<Categoria> getAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) cr.findAll();
	}

	@Override
	public void add(Categoria c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}

	@Override
	public void edit(Categoria c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}

	@Override
	public void delete(Categoria c) {
		// TODO Auto-generated method stub
		cr.delete(c);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		cr.delete(id);
	}

}
