package br.com.rafaelso.cleanarchdemo.infra.dataprovider.jpa.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaelso.cleanarchdemo.infra.dataprovider.jpa.entity.SolicitacaoJpaEntity;

@Repository
public interface SolicitacaoJpaRepository extends JpaRepository<SolicitacaoJpaEntity, UUID>{

}
