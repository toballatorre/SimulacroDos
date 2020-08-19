package cl.toballatorre.simulacrouno.controlador;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.toballatorre.simulacrouno.modelo.Factura;
import cl.toballatorre.simulacrouno.servicio.DetalleFacturaService;
import cl.toballatorre.simulacrouno.servicio.FacturaService;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {
  
	@Autowired
	FacturaService fs;
	@Autowired
	DetalleFacturaService dfs;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @GetMapping
    public String home(Model model, HttpServletRequest request) {
    	
    	int id = 0;
    	Factura factura;
    	// Manera de asegurar si el rquest es nullo o no.
    	Object Safe = request.getParameter("id");
    	System.out.println(Safe);
    	
    	if(Safe != null) {
    		id = Integer.parseInt(request.getParameter("id"));
    		factura = fs.getById(id);
    		model.addAttribute("factura", factura);
    		System.out.println("factura: " + factura);
    		System.out.println("Lista Detalle:" + dfs.getAll());
    	}else
    		id=0;
    	
    	model.addAttribute("id", id);
    	System.out.println("HOME" + id);
        return "home";
    }

}
