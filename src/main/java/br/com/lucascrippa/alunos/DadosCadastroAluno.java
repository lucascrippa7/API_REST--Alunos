package br.com.lucascrippa.alunos;

import br.com.lucascrippa.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroAluno(

        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp ="\\d{4,6}" )
        String ra,
        @NotNull
        Periodo periodo,
        @NotNull
        @Valid
        DadosEndereco endereco) {
}
