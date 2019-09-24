package br.com.itego.cursos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.itego.cursos.domain.Aluno;
import br.com.itego.cursos.domain.dto.AlunoDTO;
import br.com.itego.cursos.service.AlunoService;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoResource {
	
	@Autowired
	private AlunoService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody AlunoDTO dto) {
		service.save(AlunoDTO.dtoFromObj(dto));
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Aluno> findAll(){
		return service.findAll();
	}

}
