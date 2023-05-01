package br.com.cris.pan.ecommerce.ecommerce.entity.form;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoForm implements Serializable {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =20, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String descricao;

    @NotNull(message = "Preencha o campo corretamente.")
    private Double preco;
}
