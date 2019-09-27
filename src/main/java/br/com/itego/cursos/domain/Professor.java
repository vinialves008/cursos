package br.com.itego.cursos.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Professor extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer enumFormacao;
	
	@Temporal(TemporalType.DATE)
	private Date dtAdmissao;
	@Temporal(TemporalType.DATE)
	private Date dtDemissao;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "leciona", joinColumns = @JoinColumn(name = "professor_id"), inverseJoinColumns = @JoinColumn(name = "turma_id"))
	private List<Turma> turmas; 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEnumFormacao() {
		return enumFormacao;
	}

	public void setEnumFormacao(Integer enumFormacao) {
		this.enumFormacao = enumFormacao;
	}

	public Date getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(Date dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public Date getDtDemissao() {
		return dtDemissao;
	}

	public void setDtDemissao(Date dtDemissao) {
		this.dtDemissao = dtDemissao;
	}

}
