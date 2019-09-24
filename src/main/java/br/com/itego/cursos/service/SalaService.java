package br.com.itego.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itego.cursos.domain.Sala;
import br.com.itego.cursos.repository.SalaRepository;

@Service
public class SalaService {
	
	@Autowired
	private SalaRepository repo;

	public List<Sala> findAll() {
		return repo.findAll();
	}
	public Sala findById(Integer id) {
		Optional<Sala> oSala = repo.findById(id);
		
		if(oSala.isPresent()) {
			return oSala.get();
		}
		else {
			return new Sala();
		}
	}
	public void save(Sala sala) {
		repo.save(sala);
	}
	public void update(Sala sala) {
		Sala s = this.findById(sala.getId());
		s.setNome(sala.getNome());
		repo.save(s);
	}
	public void delete(Sala sala) {
		repo.delete(sala);
	}

}
