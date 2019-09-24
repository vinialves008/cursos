package br.com.itego.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.itego.cursos.domain.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Integer>{

}
