package br.com.rafaelso.cleanarchdemo.infra.entrypoint.http.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class AberturaSolicitacaoResponse {

	public AberturaSolicitacaoResponse(List<String> erros) {
		super();
		this.erros = erros;
	}

	public AberturaSolicitacaoResponse(SolicitacaoDataResponse data) {
		super();
		this.data = data;
	}

	@JsonInclude(Include.NON_NULL)
	private SolicitacaoDataResponse data;

	@JsonInclude(Include.NON_NULL)
	private List<String> erros;

	public AberturaSolicitacaoResponse(SolicitacaoDataResponse data, List<String> erros) {
		super();
		this.data = data;
		this.erros = erros;
	}

	public SolicitacaoDataResponse getData() {
		return data;
	}

	public void setData(SolicitacaoDataResponse data) {
		this.data = data;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}

}
