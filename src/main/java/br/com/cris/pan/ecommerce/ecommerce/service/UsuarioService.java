package br.com.cris.pan.ecommerce.ecommerce.service;

import br.com.cris.pan.ecommerce.ecommerce.entity.Usuario;
import br.com.cris.pan.ecommerce.ecommerce.entity.form.UsuarioForm;
import br.com.cris.pan.ecommerce.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public Usuario create(UsuarioForm usuarioForm) {

        Usuario usuario = new Usuario();
        usuario.setNome(usuarioForm.getNome());
        usuario.setEmail(usuarioForm.getEmail());

        return usuarioRepository.save(usuario);
    }

    public Usuario get(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public List<Usuario> getAll(String email) {

        if(email == null) {
            return usuarioRepository.findAll();
        } else {

            return usuarioRepository.findByEmail(email);
        }
    }

    public Usuario update(UsuarioForm usuarioForm, Integer id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNome(usuarioForm.getNome());
        usuario.setEmail(usuarioForm.getEmail());

        return usuarioRepository.save(usuario);
    }


    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
