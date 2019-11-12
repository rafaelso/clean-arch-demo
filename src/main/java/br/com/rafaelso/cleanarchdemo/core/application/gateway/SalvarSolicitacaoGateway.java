package br.com.rafaelso.cleanarchdemo.core.application.gateway;

import br.com.rafaelso.cleanarchdemo.core.domain.Solicitacao;

public interface SalvarSolicitacaoGateway {

	Solicitacao salvar(Solicitacao solicitacao);
}
