package com.accenture.db.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.accenture.db.entities.Transacao;


@RepositoryRestResource(collectionResourceRel = "transacoes", itemResourceRel = "transacao", path = "transacao")
public interface TransacaoDataRestRepository extends PagingAndSortingRepository<Transacao, Long> {
	
	/*
	 * List<Transacao> findByIdOrOrderByIdAsc(@Param("id") Long id);
	 * 
	 * List<Transacao> findByAtivoOrderByIdDesc(@Param("ativo") Boolean ativo);
	 */

}