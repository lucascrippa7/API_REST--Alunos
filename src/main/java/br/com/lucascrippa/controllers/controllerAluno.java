package br.com.lucascrippa.controllers;

import br.com.lucascrippa.alunos.DadosCadastroAluno;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("alunos")

public class controllerAluno {

	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroAluno dados) {
		System.out.println(dados);
	}
}
