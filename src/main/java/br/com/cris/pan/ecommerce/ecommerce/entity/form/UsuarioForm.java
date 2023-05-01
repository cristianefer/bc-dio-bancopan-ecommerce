package br.com.cris.pan.ecommerce.ecommerce.entity.form;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioForm implements Serializable {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =30, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;


    @Email
    @NotEmpty(message = "Preencha o campo corretamente.")
    private String email;


}
