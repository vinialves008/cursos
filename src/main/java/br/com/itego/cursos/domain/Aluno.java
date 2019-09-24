package br.com.itego.cursos.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Aluno extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Double notaAdmissao;
	
	
	/*
	 * @OneToOne(optional = false)
	 * 
	 * @JoinColumn(name = "pessoa_id", nullable = false) private Pessoa pessoa;
	 */
	
	

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
