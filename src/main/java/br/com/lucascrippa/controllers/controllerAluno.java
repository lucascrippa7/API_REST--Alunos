package br.com.lucascrippa.controllers;

import br.com.lucascrippa.alunos.Aluno;
import br.com.lucascrippa.alunos.AlunoRepository;
import br.com.lucascrippa.alunos.DadosCadastroAluno;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("alunos")
@Service

public class controllerAluno {

	@Autowired

	private AlunoRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroAluno dados) {

		repository.save(new Aluno(dados));
	}
}
