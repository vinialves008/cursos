package br.com.itego.cursos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.itego.cursos.domain.Cidade;
import br.com.itego.cursos.domain.Estado;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

	List<Cidade> findByEstado(Estado estado);

}
