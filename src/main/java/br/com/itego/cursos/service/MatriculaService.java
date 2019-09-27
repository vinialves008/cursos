package br.com.itego.cursos.service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itego.cursos.domain.Matricula;
import br.com.itego.cursos.repository.MatriculaRepository;

@Service
public class MatriculaService {

	@Autowired
	private MatriculaRepository repo;
	
	public List<Matricula> findAll(){
		return repo.findAll();
	}
	
	public Matricula findById(Integer id) {
		Optional<Matricula> omatricula = repo.findById(id);
		
		if(!omatricula.isPresent()) {
			throw new IllegalArgumentException("Matrícula não encontrada: " + id);
		}
		
		return omatricula.get();
	}

	public void save(Matricula matricula) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String ano = sdf.format(matricula.getTurma().getDtInicio());
		String numero = ano + "A"+matricula.getAluno().getId()+"T"+matricula.getTurma().getId();
		matricula.setNumero(numero);
		
		repo.save(matricula);
	}

}
