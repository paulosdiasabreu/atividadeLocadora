package br.com.locadora.noturno.dao;

import br.com.locadora.noturno.entidade.*;

import javax.ejb.*;

@Stateless
public class VeiculoDAO extends GenericDAO<Veiculo> {

	public VeiculoDAO(){
		super(Veiculo.class);
	}
}
