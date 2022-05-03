package br.com.victor.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.victor.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Double> {

}
  