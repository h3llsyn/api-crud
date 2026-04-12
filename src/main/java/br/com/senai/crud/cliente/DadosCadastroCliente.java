package br.com.senai.crud.cliente;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DadosCadastroCliente(
    @NotBlank
    @Size(min = 3, max = 100)
    String nome,

    @NotBlank
    @Size(max = 255)
    @Column(unique = true)
    @Email
    String email,

    @NotBlank
    @Size(min = 11, max = 11)
    @Column(unique = true)
    String cpf,

    @Size(max = 20)
    String telefone
) {
}
