package cl.toballatorre.simulacrouno.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.toballatorre.simulacrouno.modelo.Producto;
import cl.toballatorre.simulacrouno.servicio.CategoriaService;

@RestController
@RequestMapping(path = "/productos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductosCategoriaRest {
	
	@Autowired
	CategoriaService cs;
	
	@GetMapping("/{id}")
	public List<Producto> listarProductosCategoria(@PathVariable int id) {
		
		return cs.getById(id).getListaProductos(); 
	}
}
