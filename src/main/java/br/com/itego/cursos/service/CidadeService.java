package br.com.itego.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itego.cursos.domain.Cidade;
import br.com.itego.cursos.domain.Estado;
import br.com.itego.cursos.repository.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findAll(){
		return repo.findAll();
	}
	
	public Cidade findById(Integer id) {
		Optional<Cidade> ocidade = repo.findById(id);
		
		if(!ocidade.isPresent()) {
			return new Cidade();
		}
		
		return ocidade.get();
	}

	public List<Cidade> findByEstado(Estado estado) {
		return repo.findByEstado(estado);
	}

	public void save(Cidade cidade) {
		repo.save(cidade);
	}

}
