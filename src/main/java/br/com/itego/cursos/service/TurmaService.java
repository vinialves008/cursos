package br.com.itego.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itego.cursos.domain.Turma;
import br.com.itego.cursos.repository.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	private TurmaRepository repo;
	
	public List<Turma> findAll(){
		return repo.findAll();
	}
	
	public Turma findById(Integer id) {
		Optional<Turma> oturma = repo.findById(id);
		
		if(!oturma.isPresent()) {
			throw new IllegalArgumentException("Turma não encontrada: " + id);
		}
		
		return oturma.get();
	}

	public void save(Turma turma) {
		repo.save(turma);
	}

}
