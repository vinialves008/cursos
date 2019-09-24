package br.com.itego.cursos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.itego.cursos.domain.Sala;
import br.com.itego.cursos.service.SalaService;

@RestController
@RequestMapping(value = "/sala")
public class SalaResource {
	
	@Autowired
	private SalaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Sala> findAll() {
		return service.findAll();
	}
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public Sala findById(@PathVariable Integer id) {
		return service.findById(id);
	}
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Sala sala) {
		service.save(sala);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public void update(@RequestBody Sala sala) {
		service.update(sala);
	}
	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody Sala sala) {
		service.delete(sala);
	}
	

}
