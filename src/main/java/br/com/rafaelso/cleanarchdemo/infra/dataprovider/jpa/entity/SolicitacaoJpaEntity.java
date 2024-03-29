package br.com.rafaelso.cleanarchdemo.infra.dataprovider.jpa.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.rafaelso.cleanarchdemo.core.domain.StatusSolicitacao;

@Entity
@Table(name = "solicitacao")
public class SolicitacaoJpaEntity {

	@Id
	private UUID id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "status")
	private StatusSolicitacao status;
	
	@Column(name = "data_abertura")
	private LocalDateTime dataAbertura;

	public SolicitacaoJpaEntity() {
		super();
	}

	public SolicitacaoJpaEntity(UUID id, String descricao, StatusSolicitacao status, LocalDateTime dataAbertura) {
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
