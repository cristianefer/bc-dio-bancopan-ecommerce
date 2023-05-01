package br.com.cris.pan.ecommerce.ecommerce.service;

import br.com.cris.pan.ecommerce.ecommerce.entity.Produto;
import br.com.cris.pan.ecommerce.ecommerce.entity.form.ProdutoForm;
import br.com.cris.pan.ecommerce.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public Produto create(ProdutoForm produtoForm) {

        Produto produto = new Produto();
        produto.setDescricao(produtoForm.getDescricao());
        produto.setPreco(produtoForm.getPreco());

        return produtoRepository.save(produto);
    }

    public Produto get(Integer id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    public Produto update(ProdutoForm produtoForm, Integer id) {
        Produto produto = new Produto();
        produto.setId(id);
        produto.setDescricao(produtoForm.getDescricao());
        produto.setPreco(produtoForm.getPreco());

        return produtoRepository.save(produto);
    }


    public void delete(Integer id) {
        produtoRepository.deleteById(id);
    }
}
