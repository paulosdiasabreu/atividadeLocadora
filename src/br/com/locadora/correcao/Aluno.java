package br.com.locadora.correcao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aluno {

	@OneToMany(mappedBy="aluno")
	private List<Boleto> boletos;
	
	@ManyToMany
	@JoinTable(name="AlunoTurma",
		joinColumns = @JoinColumn(name="matricula"),
		inverseJoinColumns = @JoinColumn(name="idTurma"))
	private List<Turma> turmas;
	
}
