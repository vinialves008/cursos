package br.com.itego.cursos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.itego.cursos.domain.Estado;
import br.com.itego.cursos.service.EstadoService;

@RestController
@RequestMapping(value = "/estado")
public class EstadoResource {
	
	@Autowired
	private EstadoService estadoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Estado> findAll(){
		return estadoService.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Estado getEstado(@PathVariable Integer id) {
		return estadoService.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void insert(@RequestBody Estado estado) {
		estadoService.save(estado);
	}
	

}
