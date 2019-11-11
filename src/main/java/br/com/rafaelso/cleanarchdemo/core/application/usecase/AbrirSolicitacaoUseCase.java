package br.com.rafaelso.cleanarchdemo.core.application.usecase;

import org.springframework.stereotype.Component;

import br.com.rafaelso.cleanarchdemo.core.application.dto.AbrirSolicitacaoEntrada;
import br.com.rafaelso.cleanarchdemo.core.application.dto.AbrirSolicitacaoSaida;

@Component
public class AbrirSolicitacaoUseCase implements UseCase<AbrirSolicitacaoEntrada, AbrirSolicitacaoSaida>{

	@Override
	public AbrirSolicitacaoSaida executar(AbrirSolicitacaoEntrada entrada) {
		// TODO Auto-generated method stub
		return null;
	}

}
