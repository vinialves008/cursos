package br.com.itego.cursos.service;

import java.util.List;
import java.util.Optional;

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

	public Aluno findById(Integer id) {
		Optional<Aluno> oaluno = repo.findById(id);

		if (!oaluno.isPresent()) {
			throw new IllegalArgumentException("Aluno não encontrado: " + id);
		}

		return oaluno.get();
	}

	public List<Aluno> findAll() {
		return repo.findAll();
	}

}
