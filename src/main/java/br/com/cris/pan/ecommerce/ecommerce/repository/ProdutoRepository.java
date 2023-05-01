package br.com.cris.pan.ecommerce.ecommerce.repository;

import br.com.cris.pan.ecommerce.ecommerce.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>, CrudRepository<Produto, Integer> {
}
