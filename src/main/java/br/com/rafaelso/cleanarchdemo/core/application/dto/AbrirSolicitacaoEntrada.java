package br.com.rafaelso.cleanarchdemo.core.application.dto;

public class AbrirSolicitacaoEntrada {

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public AbrirSolicitacaoEntrada(String descricao) {
		super();
		this.descricao = descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
