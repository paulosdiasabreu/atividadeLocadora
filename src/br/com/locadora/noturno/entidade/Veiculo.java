package br.com.locadora.noturno.entidade;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="Veiculo")//Opcional
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idVeiculo;
	
	@Column(name="placa")//Opcional
	@NotNull(message="Informe a placa")
	private String placa;
	
	@NotNull(message="Informe o valor")
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name="idModelo")
	@NotNull(message="Informe o modelo")
	private Modelo modelo;
	
	@ManyToMany
	@JoinTable(name="Veiculo_Opcional",
		joinColumns = @JoinColumn(name="idVeiculo"),
		inverseJoinColumns = @JoinColumn(name="idOpcional"))
	private List<Opcional> opcionais;
	
	public Integer getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(Integer idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public List<Opcional> getOpcionais() {
		return opcionais;
	}
	public void setOpcionais(List<Opcional> opcionais) {
		this.opcionais = opcionais;
	}
	
	
}
