package br.com.locadora.noturno.entidade;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Locacao {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idLocacao;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicio;
	
	private Double valorTotal;
	
	@ManyToOne
	@JoinColumn(name = "idCliente") //Nome FK
	private Cliente cliente;

	public Integer getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(Integer idLocacao) {
		this.idLocacao = idLocacao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
}
