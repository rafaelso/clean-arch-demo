package br.com.rafaelso.cleanarchdemo.infra.dataprovider.jpa;

import org.springframework.stereotype.Component;

import br.com.rafaelso.cleanarchdemo.core.application.gateway.SalvarSolicitacaoGateway;
import br.com.rafaelso.cleanarchdemo.core.domain.Solicitacao;
import br.com.rafaelso.cleanarchdemo.infra.dataprovider.jpa.entity.SolicitacaoJpaEntity;
import br.com.rafaelso.cleanarchdemo.infra.dataprovider.jpa.repository.SolicitacaoJpaRepository;

@Component
public class SalvarSolicitacaoDataProvider implements SalvarSolicitacaoGateway {

	private SolicitacaoJpaRepository repository;

	public SalvarSolicitacaoDataProvider(SolicitacaoJpaRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Solicitacao salvar(Solicitacao solicitacao) {

		SolicitacaoJpaEntity solicitacaoJpaEntity = new SolicitacaoJpaEntity(solicitacao.getId(),
				solicitacao.getDescricao(), solicitacao.getStatus(), solicitacao.getDataAbertura());

		SolicitacaoJpaEntity entityCriada = repository.save(solicitacaoJpaEntity);

		return new Solicitacao(entityCriada.getId(), entityCriada.getDescricao(), entityCriada.getStatus(),
				entityCriada.getDataAbertura());
	}

}
