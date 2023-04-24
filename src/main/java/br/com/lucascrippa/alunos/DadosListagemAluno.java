package br.com.lucascrippa.alunos;

public record DadosListagemAluno(String nome, String email, String ra, Periodo periodo) {

    public DadosListagemAluno(Aluno aluno){
        this(aluno.getNome(), aluno.getEmail(), aluno.getRa(), aluno.getPeriodo());
    }
}
