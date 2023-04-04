package br.com.lucascrippa.config;

import br.com.lucascrippa.alunos.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "br.com.lucascrippa")
public class JpaConfig {

    @Autowired
    private AlunoRepository alunoRepository;

}
