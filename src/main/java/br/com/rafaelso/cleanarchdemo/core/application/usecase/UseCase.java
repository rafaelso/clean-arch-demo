package br.com.rafaelso.cleanarchdemo.core.application.usecase;

public interface UseCase<I, O> {

	O executar(I entrada);
}
