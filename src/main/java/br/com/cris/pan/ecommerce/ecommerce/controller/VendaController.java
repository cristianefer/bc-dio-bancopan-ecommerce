package br.com.cris.pan.ecommerce.ecommerce.controller;


import br.com.cris.pan.ecommerce.ecommerce.entity.Venda;
import br.com.cris.pan.ecommerce.ecommerce.entity.form.VendaForm;
import br.com.cris.pan.ecommerce.ecommerce.service.VendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;


    @PostMapping
    public Venda create(@Valid @RequestBody VendaForm form) {
        return vendaService.create(form);
    }

    @GetMapping("/{id}")
    public Venda get(@PathVariable Integer id) {
        return vendaService.get(id);
    }
}
