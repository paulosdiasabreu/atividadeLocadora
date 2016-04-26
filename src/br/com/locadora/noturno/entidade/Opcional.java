package br.com.locadora.noturno.entidade;

import java.util.List;

import javax.persistence.*;

@Entity
public class Opcional {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short idOpcional;
	
	private String descricao;
	
	@ManyToMany(mappedBy="opcionais")
	private List<Veiculo> veiculos;

	public Short getIdOpcional() {
		return idOpcional;
	}

	public void setIdOpcional(Short idOpcional) {
		this.idOpcional = idOpcional;
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
		result = prime * result + ((idOpcional == null) ? 0 : idOpcional.hashCode());
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
		Opcional other = (Opcional) obj;
		if (idOpcional == null) {
			if (other.idOpcional != null)
				return false;
		} else if (!idOpcional.equals(other.idOpcional))
			return false;
		return true;
	}
	
	
	
	
	
}
