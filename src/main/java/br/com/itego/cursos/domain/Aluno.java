package br.com.itego.cursos.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Aluno extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Double notaAdmissao;
	
	@OneToMany(mappedBy = "id.aluno")
	private Set<Matricula> matriculas;
	

	public Integer getId() {
		return id;
	}

	public Aluno() {
		
	}
	public Aluno(Integer id, Double notaAdmissao, String nome, String cpf, Date dtNasc, String telefone, String email, Endereco endereco) {
		this.id = id;
		this.notaAdmissao = notaAdmissao;
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDtNasc(dtNasc);
		this.setTelefone(telefone);
		this.setEmail(email);
		this.setEndereco(endereco);
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Set<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(Set<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getNotaAdmissao() {
		return notaAdmissao;
	}

	public void setNotaAdmissao(Double notaAdmissao) {
		this.notaAdmissao = notaAdmissao;
	}

	/*
	 * public Pessoa getPessoa() { return pessoa; }
	 * 
	 * public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
	 */
	
	

}
