package br.com.rafaelso.cleanarchdemo.infra.entrypoint.http.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.rafaelso.cleanarchdemo.core.domain.StatusSolicitacao;

public class AberturaSolicitacaoResponse {

	private UUID id;

	private String descricao;

	private StatusSolicitacao status;

	@JsonProperty("aberta_em")
	private LocalDateTime dataAbertura;

	public AberturaSolicitacaoResponse(UUID id, String descricao, StatusSolicitacao status,
			LocalDateTime dataAbertura) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.status = status;
		this.dataAbertura = dataAbertura;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusSolicitacao getStatus() {
		return status;
	}

	public void setStatus(StatusSolicitacao status) {
		this.status = status;
	}

	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
}
