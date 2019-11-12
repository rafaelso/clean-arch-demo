package br.com.rafaelso.cleanarchdemo.infra.entrypoint.http;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaelso.cleanarchdemo.core.application.dto.AbrirSolicitacaoEntrada;
import br.com.rafaelso.cleanarchdemo.core.application.dto.AbrirSolicitacaoSaida;
import br.com.rafaelso.cleanarchdemo.core.application.usecase.AbrirSolicitacaoUseCase;
import br.com.rafaelso.cleanarchdemo.infra.entrypoint.http.dto.AberturaSolicitacaoRequest;
import br.com.rafaelso.cleanarchdemo.infra.entrypoint.http.dto.AberturaSolicitacaoResponse;

@RestController
@RequestMapping("/solicitacoes")
public class SolicitacaoController {

	private AbrirSolicitacaoUseCase usecase;

	public SolicitacaoController(AbrirSolicitacaoUseCase usecase) {
		super();
		this.usecase = usecase;
	}

	@PostMapping
	public ResponseEntity<AberturaSolicitacaoResponse> abrirSolicitacao(
			@RequestBody AberturaSolicitacaoRequest entrada) {

		AbrirSolicitacaoSaida saida = usecase.executar(new AbrirSolicitacaoEntrada(entrada.getDescricao()));

		if (!saida.getErros().isEmpty()) {
			return ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok()
				.body(new AberturaSolicitacaoResponse(saida.getSolicitacao().getId(),
						saida.getSolicitacao().getDescricao(), saida.getSolicitacao().getStatus(),
						saida.getSolicitacao().getDataAbertura()));
	}
}
