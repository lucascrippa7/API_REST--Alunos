package br.com.lucascrippa.alunos;


import br.com.lucascrippa.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;


@Table(name = "alunos")
@Entity(name = "Aluno")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of= "id")



public class Aluno {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    private String telefone;
    private String ra;

    @Enumerated(EnumType.STRING)
    private Periodo periodo;

    @Embedded
    private Endereco endereco;

    public Aluno(DadosCadastroAluno dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.ra = dados.ra();
        this.periodo =  dados.periodo();
        this.endereco = new Endereco(dados.endereco());

    }
}
