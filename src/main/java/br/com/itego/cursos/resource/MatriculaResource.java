package br.com.itego.cursos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.itego.cursos.domain.Matricula;
import br.com.itego.cursos.domain.dto.MatriculaNewDTO;
import br.com.itego.cursos.service.AlunoService;
import br.com.itego.cursos.service.MatriculaService;
import br.com.itego.cursos.service.TurmaService;

@RestController
@RequestMapping(value = "/matricula")
public class MatriculaResource {
	
	@Autowired
	private MatriculaService matriculaService;
	
	@Autowired
	private AlunoService alunoService;
	
	@Autowired
	private TurmaService turmaService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Matricula> findAll(){
		return matriculaService.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Matricula getMatricula(@PathVariable Integer id) {
		return matriculaService.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void insert(@RequestBody MatriculaNewDTO dto) {
		Matricula matricula = new Matricula();
		matricula.setAluno(alunoService.findById(dto.getAluno()));
		matricula.setTurma(turmaService.findById(dto.getTurma()));
		matriculaService.save(matricula);
	}
	

}
