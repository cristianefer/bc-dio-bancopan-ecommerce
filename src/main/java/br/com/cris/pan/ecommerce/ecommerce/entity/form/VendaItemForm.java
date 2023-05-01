package br.com.cris.pan.ecommerce.ecommerce.entity.form;

import br.com.cris.pan.ecommerce.ecommerce.entity.Produto;
import br.com.cris.pan.ecommerce.ecommerce.entity.Venda;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendaItemForm {

    @NotNull(message = "Prencha o campo corretamente.")
    private Integer quantidade;

    @NotNull(message = "Prencha o campo corretamente.")
    private Double subTotal;

    @NotNull(message = "Prencha o campo corretamente.")
    private Integer produtoId;

    @NotNull(message = "Prencha o campo corretamente.")
    private Integer vendaId;
}
