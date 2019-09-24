package br.com.itego.cursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itego.cursos.domain.Aluno;
import br.com.itego.cursos.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repo;

	public void save(Aluno aluno) {
		repo.save(aluno);
	}

	public List<Aluno> findAll() {
		return repo.findAll();
	}
	
	
}
