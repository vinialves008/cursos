package br.com.itego.cursos.domain.enums;

public enum EnumTurno {
	
	MATUTINO(1, "Matutino"),
	VESPERTINO(2, "Vespertino"),
	NOTURNO(3, "Noturno"),
	INTEGRAL(4, "Integral");
	
	private Integer cod;
	private String descricao;
	
	private EnumTurno(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EnumTurno toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(EnumTurno x : EnumTurno.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("ID inválido: " + cod);
	}

}
