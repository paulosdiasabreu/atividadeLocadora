package br.com.locadora.noturno.entidade;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
public class Modelo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short idModelo;
	
	@NotNull(message="Informe a descrição")
	private String descricao;
	
	@OneToMany(mappedBy = "modelo")
	private List<Veiculo>  veiculos;
	
	
	//get e set
	public Short getIdModelo() {
		return idModelo;
	}
	public void setIdModelo(Short idModelo) {
		this.idModelo = idModelo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	//hashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idModelo == null) ? 0 : idModelo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo other = (Modelo) obj;
		if (idModelo == null) {
			if (other.idModelo != null)
				return false;
		} else if (!idModelo.equals(other.idModelo))
			return false;
		return true;
	}
	
	
	
}
