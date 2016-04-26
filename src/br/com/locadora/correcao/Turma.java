package br.com.locadora.correcao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Turma {

	@ManyToMany(mappedBy="turmas")
	private List<Aluno> alunos;
	
}
