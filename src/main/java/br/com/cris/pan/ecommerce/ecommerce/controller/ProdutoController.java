package br.com.cris.pan.ecommerce.ecommerce.controller;

import br.com.cris.pan.ecommerce.ecommerce.entity.Produto;
import br.com.cris.pan.ecommerce.ecommerce.entity.form.ProdutoForm;
import br.com.cris.pan.ecommerce.ecommerce.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {


    @Autowired
    private ProdutoService produtoService;


    @PostMapping
    public Produto create(@Valid @RequestBody ProdutoForm form) {
        return produtoService.create(form);
    }

    @GetMapping("/{id}")
    public Produto get(@PathVariable Integer id) {
        return produtoService.get(id);
    }

    @GetMapping
    public List<Produto> getAll(){
        return produtoService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        produtoService.delete(id);
    }
}
