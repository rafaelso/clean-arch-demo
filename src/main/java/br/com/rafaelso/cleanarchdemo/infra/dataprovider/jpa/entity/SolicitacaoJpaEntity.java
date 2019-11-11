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
}
