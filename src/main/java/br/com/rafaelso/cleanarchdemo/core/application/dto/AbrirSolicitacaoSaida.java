package br.com.rafaelso.cleanarchdemo.core.application.dto;

import java.util.List;

import br.com.rafaelso.cleanarchdemo.core.domain.Solicitacao;

public class AbrirSolicitacaoSaida {

	public AbrirSolicitacaoSaida(List<String> erros) {
		super();
		this.erros = erros;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}

	private List<String> erros;
	
	private Solicitacao solicitacao;

	public Solicitacao getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}
}
