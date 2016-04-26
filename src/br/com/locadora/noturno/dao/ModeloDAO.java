package br.com.locadora.noturno.dao;

import br.com.locadora.noturno.entidade.*;
import javax.ejb.*;

@Stateless
public class ModeloDAO extends GenericDAO<Modelo> {
	
	public ModeloDAO(){
		super(Modelo.class);
	}
}
