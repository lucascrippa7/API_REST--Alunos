package br.com.lucascrippa.alunos;

import br.com.lucascrippa.endereco.DadosEndereco;

public record DadosCadastroAluno(String nome, String email, String ra, Periodo periodo, DadosEndereco endereco) {
}
