package br.com.itego.cursos.domain.enums;

public enum EnumTipoCurso {
	
	TECNICO(1, "Cursos Técnicos"),
	QUALIFICACAO(2, "Cursos de Qualificação");
	
	private Integer cod;
	private String descricao;
	
	private EnumTipoCurso(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EnumTipoCurso toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(EnumTipoCurso x : EnumTipoCurso.values()) {
			if(x.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("ID inválido: " + cod);
	}

}
