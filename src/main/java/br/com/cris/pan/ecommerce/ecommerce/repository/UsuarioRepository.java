package br.com.cris.pan.ecommerce.ecommerce.repository;

import br.com.cris.pan.ecommerce.ecommerce.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>, CrudRepository<Usuario, Integer> {

    List<Usuario> findByEmail(String email);
}
