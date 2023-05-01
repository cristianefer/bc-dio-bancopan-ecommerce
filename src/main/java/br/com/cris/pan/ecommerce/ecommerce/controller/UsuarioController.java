package br.com.cris.pan.ecommerce.ecommerce.controller;

import br.com.cris.pan.ecommerce.ecommerce.entity.Usuario;
import br.com.cris.pan.ecommerce.ecommerce.entity.form.UsuarioForm;
import br.com.cris.pan.ecommerce.ecommerce.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;


    @PostMapping
    public Usuario create(@Valid @RequestBody UsuarioForm form) {
        return usuarioService.create(form);
    }

    @GetMapping("/{id}")
    public Usuario get(@PathVariable Integer id) {
        return usuarioService.get(id);
    }

    @GetMapping
    public List<Usuario> getAll(@RequestParam(value = "email", required = false) String email){
        return usuarioService.getAll(email);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        usuarioService.delete(id);
    }
}
