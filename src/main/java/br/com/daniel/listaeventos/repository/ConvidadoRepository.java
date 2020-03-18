package br.com.daniel.listaeventos.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.daniel.listaeventos.model.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

}
