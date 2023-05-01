package br.com.cris.pan.ecommerce.ecommerce.repository;

import br.com.cris.pan.ecommerce.ecommerce.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {
}
