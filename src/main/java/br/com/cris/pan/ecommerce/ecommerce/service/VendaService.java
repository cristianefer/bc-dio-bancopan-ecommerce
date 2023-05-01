package br.com.cris.pan.ecommerce.ecommerce.service;

import br.com.cris.pan.ecommerce.ecommerce.entity.Produto;
import br.com.cris.pan.ecommerce.ecommerce.entity.Usuario;
import br.com.cris.pan.ecommerce.ecommerce.entity.Venda;
import br.com.cris.pan.ecommerce.ecommerce.entity.VendaItem;
import br.com.cris.pan.ecommerce.ecommerce.entity.form.VendaForm;
import br.com.cris.pan.ecommerce.ecommerce.entity.form.VendaItemForm;
import br.com.cris.pan.ecommerce.ecommerce.repository.ProdutoRepository;
import br.com.cris.pan.ecommerce.ecommerce.repository.UsuarioRepository;
import br.com.cris.pan.ecommerce.ecommerce.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Venda create(VendaForm vendaForm) {

        Usuario usuario = usuarioRepository.getReferenceById(vendaForm.getUsuarioId());

        Venda venda = new Venda();
        venda.setDataDaVenda(vendaForm.getDataDaVenda());
        venda.setUsuario(usuario);
        venda.setTotal(0.0);
        venda.setItens(new ArrayList<>());

        for (VendaItemForm itemForm: vendaForm.getItens()) {

            Produto produto = produtoRepository.findById(itemForm.getProdutoId()).get();

            VendaItem item = new VendaItem();
            item.setQuantidade(itemForm.getQuantidade());
            item.setSubTotal(itemForm.getQuantidade() * produto.getPreco());
            item.setProduto(produto);
            item.setVenda(venda);

            venda.setTotal(venda.getTotal() + item.getSubTotal());

            venda.getItens().add(item);
        }

        return vendaRepository.save(venda);
    }

    public Venda get(Integer id) {
        return vendaRepository.findById(id).orElse(null);
    }

}
