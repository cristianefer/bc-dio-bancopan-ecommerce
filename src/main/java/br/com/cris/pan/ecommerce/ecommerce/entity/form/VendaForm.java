package br.com.cris.pan.ecommerce.ecommerce.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendaForm {

    @NotNull(message = "Prencha o campo corretamente.")
    private LocalDate dataDaVenda;

    @NotNull(message = "Prencha o campo corretamente.")
    private Integer usuarioId;


    private List<VendaItemForm> itens;
}
