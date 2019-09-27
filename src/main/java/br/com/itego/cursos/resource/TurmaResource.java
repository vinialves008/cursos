package br.com.itego.cursos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.itego.cursos.domain.Turma;
import br.com.itego.cursos.service.TurmaService;

@RestController
@RequestMapping(value = "/turma")
public class TurmaResource {
	
	@Autowired
	private TurmaService turmaService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Turma> findAll(){
		return turmaService.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Turma getTurma(@PathVariable Integer id) {
		return turmaService.findById(id);
	}
	
	
	@RequestMapping(method =  RequestMethod.POST)
	public void save(@RequestBody Turma turma) {
		turmaService.save(turma);
	}
	

}
