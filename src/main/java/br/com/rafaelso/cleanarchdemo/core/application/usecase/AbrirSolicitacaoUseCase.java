package br.com.rafaelso.cleanarchdemo.core.application.usecase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import br.com.rafaelso.cleanarchdemo.core.application.dto.AbrirSolicitacaoEntrada;
import br.com.rafaelso.cleanarchdemo.core.application.dto.AbrirSolicitacaoSaida;
import br.com.rafaelso.cleanarchdemo.core.application.gateway.SalvarSolicitacaoGateway;
import br.com.rafaelso.cleanarchdemo.core.domain.Solicitacao;
import br.com.rafaelso.cleanarchdemo.core.domain.StatusSolicitacao;

@Service
public class AbrirSolicitacaoUseCase implements UseCase<AbrirSolicitacaoEntrada, AbrirSolicitacaoSaida> {

	private SalvarSolicitacaoGateway gateway;

	public AbrirSolicitacaoUseCase(SalvarSolicitacaoGateway gateway) {
		super();
		this.gateway = gateway;
	}

	@Override
	public AbrirSolicitacaoSaida executar(AbrirSolicitacaoEntrada entrada) {

		AbrirSolicitacaoSaida resposta = new AbrirSolicitacaoSaida(new ArrayList<String>());

		if (entrada != null && StringUtils.isBlank(entrada.getDescricao())) {
			resposta.getErros().add("A descrição não pode ser nula ou branco");
		}

		if (!resposta.getErros().isEmpty()) {
			return resposta;
		}

		Solicitacao solicitacaoAberta = gateway.salvar(new Solicitacao(UUID.randomUUID(), entrada.getDescricao(),
				StatusSolicitacao.ABERTA, LocalDateTime.now()));

		resposta.setSolicitacao(solicitacaoAberta);

		return resposta;
	}

}
