package br.com.itego.cursos.domain.enums;

public enum EnumTipoFormacao {
	
	SUPERIOR(1, "Ensino Superior"),
	POSGRADUACAO(2, "Pós Graduação"),
	MESTRADO(3, "Mestrado"),
	DOUTORADO(4, "Doutorado");
	
	private Integer cod;
	private String descricao;
	
	private EnumTipoFormacao(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EnumTipoFormacao toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(EnumTipoFormacao x : EnumTipoFormacao.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("ID inválido: " + cod);
	}

}
