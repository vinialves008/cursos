package br.com.itego.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itego.cursos.domain.Estado;
import br.com.itego.cursos.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;
	
	public List<Estado> findAll(){
		return repo.findAll();
	}
	
	public Estado findById(Integer id) {
		Optional<Estado> oestado = repo.findById(id);
		
		if(!oestado.isPresent()) {
			throw new IllegalArgumentException("Estado não encontrado: " + id);
		}
		
		return oestado.get();
	}

	public void save(Estado estado) {
		repo.save(estado);
	}

}
