package br.com.locadora.correcao;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Boleto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoBoleto;
	
	@Temporal(TemporalType.DATE)
	private Date vencimento;
	
	@ManyToOne
	@JoinColumn(name="matricula")
	private Aluno aluno;
}
